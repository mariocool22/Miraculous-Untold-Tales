package net.mcreator.miraculousuntoldtales.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiraculousUntoldTalesModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		MiraculousUntoldTalesMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.ladybug_camos = original.ladybug_camos;
			clone.Cat_camos = original.Cat_camos;
			clone.Butterfly_camos = original.Butterfly_camos;
			clone.lb_helmet = original.lb_helmet;
			clone.lb_Chestplate = original.lb_Chestplate;
			clone.lb_Leggings = original.lb_Leggings;
			clone.lb_boots = original.lb_boots;
			clone.Main_Miraculous = original.Main_Miraculous;
			clone.Ladybug_Suits = original.Ladybug_Suits;
			clone.Transformed = original.Transformed;
			clone.norm_helmet = original.norm_helmet;
			clone.norm_chest = original.norm_chest;
			clone.norm_legs = original.norm_legs;
			clone.norm_boots = original.norm_boots;
			clone.LadybugFormOn = original.LadybugFormOn;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("miraculous_untold_tales", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String ladybug_camos = "";
		public String Cat_camos = "";
		public String Butterfly_camos = "";
		public ItemStack lb_helmet = ItemStack.EMPTY;
		public ItemStack lb_Chestplate = ItemStack.EMPTY;
		public ItemStack lb_Leggings = ItemStack.EMPTY;
		public ItemStack lb_boots = ItemStack.EMPTY;
		public String Main_Miraculous = "";
		public String Ladybug_Suits = "";
		public boolean Transformed = false;
		public ItemStack norm_helmet = ItemStack.EMPTY;
		public ItemStack norm_chest = ItemStack.EMPTY;
		public ItemStack norm_legs = ItemStack.EMPTY;
		public ItemStack norm_boots = ItemStack.EMPTY;
		public boolean LadybugFormOn = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				MiraculousUntoldTalesMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("ladybug_camos", ladybug_camos);
			nbt.putString("Cat_camos", Cat_camos);
			nbt.putString("Butterfly_camos", Butterfly_camos);
			nbt.put("lb_helmet", lb_helmet.save(new CompoundTag()));
			nbt.put("lb_Chestplate", lb_Chestplate.save(new CompoundTag()));
			nbt.put("lb_Leggings", lb_Leggings.save(new CompoundTag()));
			nbt.put("lb_boots", lb_boots.save(new CompoundTag()));
			nbt.putString("Main_Miraculous", Main_Miraculous);
			nbt.putString("Ladybug_Suits", Ladybug_Suits);
			nbt.putBoolean("Transformed", Transformed);
			nbt.put("norm_helmet", norm_helmet.save(new CompoundTag()));
			nbt.put("norm_chest", norm_chest.save(new CompoundTag()));
			nbt.put("norm_legs", norm_legs.save(new CompoundTag()));
			nbt.put("norm_boots", norm_boots.save(new CompoundTag()));
			nbt.putBoolean("LadybugFormOn", LadybugFormOn);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			ladybug_camos = nbt.getString("ladybug_camos");
			Cat_camos = nbt.getString("Cat_camos");
			Butterfly_camos = nbt.getString("Butterfly_camos");
			lb_helmet = ItemStack.of(nbt.getCompound("lb_helmet"));
			lb_Chestplate = ItemStack.of(nbt.getCompound("lb_Chestplate"));
			lb_Leggings = ItemStack.of(nbt.getCompound("lb_Leggings"));
			lb_boots = ItemStack.of(nbt.getCompound("lb_boots"));
			Main_Miraculous = nbt.getString("Main_Miraculous");
			Ladybug_Suits = nbt.getString("Ladybug_Suits");
			Transformed = nbt.getBoolean("Transformed");
			norm_helmet = ItemStack.of(nbt.getCompound("norm_helmet"));
			norm_chest = ItemStack.of(nbt.getCompound("norm_chest"));
			norm_legs = ItemStack.of(nbt.getCompound("norm_legs"));
			norm_boots = ItemStack.of(nbt.getCompound("norm_boots"));
			LadybugFormOn = nbt.getBoolean("LadybugFormOn");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.ladybug_camos = message.data.ladybug_camos;
					variables.Cat_camos = message.data.Cat_camos;
					variables.Butterfly_camos = message.data.Butterfly_camos;
					variables.lb_helmet = message.data.lb_helmet;
					variables.lb_Chestplate = message.data.lb_Chestplate;
					variables.lb_Leggings = message.data.lb_Leggings;
					variables.lb_boots = message.data.lb_boots;
					variables.Main_Miraculous = message.data.Main_Miraculous;
					variables.Ladybug_Suits = message.data.Ladybug_Suits;
					variables.Transformed = message.data.Transformed;
					variables.norm_helmet = message.data.norm_helmet;
					variables.norm_chest = message.data.norm_chest;
					variables.norm_legs = message.data.norm_legs;
					variables.norm_boots = message.data.norm_boots;
					variables.LadybugFormOn = message.data.LadybugFormOn;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
