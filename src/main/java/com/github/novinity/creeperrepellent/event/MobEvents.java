package com.github.novinity.creeperrepellent.event;

import com.github.novinity.creeperrepellent.CreeperRepellent;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.entity.monster.Creeper;

@Mod.EventBusSubscriber(modid = CreeperRepellent.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MobEvents {
    // Disables creeper spawns lol

//    @SubscribeEvent
//    public static void MobSpawnEvent(EntityJoinLevelEvent event) {
//        Entity entity = event.getEntity();
//        if (entity.isAlive() && entity instanceof Creeper) {
//            event.setCanceled(true);
//        }
//    }


}
