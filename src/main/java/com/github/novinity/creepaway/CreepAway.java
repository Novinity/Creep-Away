package com.github.novinity.creepaway;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CreepAway.MODID)
public class CreepAway {
    public static final String MODID = "creepaway";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreepAway() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
