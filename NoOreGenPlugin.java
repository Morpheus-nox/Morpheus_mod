package com.morpheus.noore;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class NoOreGenPlugin extends JavaPlugin implements Listener {

    private final NoOrePopulator populator = new NoOrePopulator();

    @Override
    public void onEnable() {
        // Adiciona o populator aos mundos já carregados
        for (World world : Bukkit.getWorlds()) {
            addPopulatorToWorld(world);
        }

        // Registra eventos (opcional para futuramente lidar com ChunkLoadEvent)
        Bukkit.getPluginManager().registerEvents(new NoOreChunkListener(), this);

        getLogger().info("§aNoOreGen ativado! Minérios não serão mais gerados em novos chunks.");
    }

    private void addPopulatorToWorld(World world) {
        if (!world.getPopulators().contains(populator)) {
            world.getPopulators().add(populator);
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("§cNoOreGen desativado.");
    }
}
