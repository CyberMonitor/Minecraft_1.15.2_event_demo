package com.example.examplemod.events;

import com.example.examplemod.ExampleMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.event.world.BlockEvent.BreakEvent; 
import net.minecraftforge.event.world.BlockEvent.EntityPlaceEvent;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BreakEventHandler{
    @SubscribeEvent
    public static void onJumpEvent(BreakEvent event) {
        ExampleMod.LOGGER.info("Block Break");

    }

    @SubscribeEvent
    public static void onJumpEvent(EntityPlaceEvent event) {
        ExampleMod.LOGGER.info("player put a Block");

    }   
}