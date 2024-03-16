package com.github.novinity.creepaway.event;

import com.github.novinity.creepaway.CreepAway;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreepAway.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
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
