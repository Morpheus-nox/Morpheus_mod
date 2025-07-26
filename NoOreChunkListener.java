package com.morpheus.noore;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.EnumSet;
import java.util.Set;

public class NoOreChunkListener implements Listener {

    private static final Set<Material> ORES_TO_REMOVE = EnumSet.of(
            Material.COAL_ORE,
            Material.IRON_ORE,
            Material.COPPER_ORE,
            Material.GOLD_ORE,
            Material.REDSTONE_ORE,
            Material.LAPIS_ORE,
            Material.DIAMOND_ORE,
            Material.EMERALD_ORE,
            Material.DEEPSLATE_COAL_ORE,
            Material.DEEPSLATE_IRON_ORE,
            Material.DEEPSLATE_COPPER_ORE,
            Material.DEEPSLATE_GOLD_ORE,
            Material.DEEPSLATE_REDSTONE_ORE,
            Material.DEEPSLATE_LAPIS_ORE,
            Material.DEEPSLATE_DIAMOND_ORE,
            Material.DEEPSLATE_EMERALD_ORE,
            Material.NETHER_QUARTZ_ORE,
            Material.NETHER_GOLD_ORE,
            Material.ANCIENT_DEBRIS
    );

    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event) {
        // Só processa chunks recém-gerados
        if (!event.isNewChunk()) return;

        Chunk chunk = event.getChunk();
        World world = chunk.getWorld();

        final int minY = world.getMinHeight();
        final int maxY = world.getMaxHeight();

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = minY; y < maxY; y++) {
                    Block block = chunk.getBlock(x, y, z);
                    if (ORES_TO_REMOVE.contains(block.getType())) {
                        block.setType(Material.STONE, false);
                    }
                }
            }
        }
    }
}
