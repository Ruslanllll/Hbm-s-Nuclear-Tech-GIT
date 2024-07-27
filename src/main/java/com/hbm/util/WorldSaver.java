package com.hbm.util;

import com.hbm.main.MainRegistry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class WorldSaver {
    public static void backup(World world) {
        File file = new File("./" + world.getWorldInfo().getWorldName());
        File lastBackup = null;
        int i = 0;
        boolean flag = false;
        while(!flag){
            lastBackup = new File("." + world.getWorldInfo().getWorldName()+"_"+i);
            if(!lastBackup.exists()){
                flag = true;
                break;
            }
            i++;
        }
        try{
            lastBackup.mkdir();
            FileUtils.copyDirectory(file, lastBackup);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
