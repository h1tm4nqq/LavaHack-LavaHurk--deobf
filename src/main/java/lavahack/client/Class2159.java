//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.entity.ai.EntityAITasks$EntityAITaskEntry
 *  net.minecraft.entity.ai.EntityAIWatchClosest
 *  net.minecraft.entity.ai.EntityLookHelper
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 */
package lavahack.client;

import lavahack.client.Class1155;
import lavahack.client.Class1796;
import lavahack.client.Class279;
import lavahack.client.Class611;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class Class2159 {
    public static boolean Field17865 = false;
    public static boolean Field17866 = false;
    public static boolean Field17867 = false;
    public static boolean Field17868 = true;
    private String Field17869 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2159() {
        ++Class1796.Field16241.Field16286.Field11713;
    }

    public void Method7782() {
        Class1155.Method4678();
        Class1796.Field16242.Method715(new Class279("AI Improved"));
    }

    public void Method7783(EntityJoinWorldEvent entityJoinWorldEvent) {
        EntityLookHelper entityLookHelper;
        if (!Field17865) {
            return;
        }
        Entity entity = entityJoinWorldEvent.getEntity();
        if (!(entity instanceof EntityLiving)) return;
        EntityLiving entityLiving = (EntityLiving)entity;
        if (Field17866 || Field17867) {
            entityLookHelper = entityLiving.tasks.taskEntries.iterator();
            while (entityLookHelper.hasNext()) {
                Object e = entityLookHelper.next();
                if (!(e instanceof EntityAITasks.EntityAITaskEntry)) continue;
                EntityAITasks.EntityAITaskEntry entityAITaskEntry = (EntityAITasks.EntityAITaskEntry)e;
                if (!(Field17866 && entityAITaskEntry.action instanceof EntityAIWatchClosest || Field17867 && entityAITaskEntry.action instanceof EntityAILookIdle)) continue;
                entityLookHelper.remove();
            }
        }
        if (!Field17868) return;
        if (entityLiving.getLookHelper() != null) {
            if (entityLiving.getLookHelper().getClass() != EntityLookHelper.class) return;
        }
        entityLookHelper = entityLiving.lookHelper;
        entityLiving.lookHelper = new Class611(entityLiving);
        entityLiving.lookHelper.posX = entityLookHelper.posX;
        entityLiving.lookHelper.posY = entityLookHelper.posY;
        entityLiving.lookHelper.posZ = entityLookHelper.posZ;
        entityLiving.lookHelper.isLooking = entityLookHelper.isLooking;
        entityLiving.lookHelper.deltaLookPitch = entityLookHelper.deltaLookPitch;
        entityLiving.lookHelper.deltaLookYaw = entityLookHelper.deltaLookYaw;
    }

    private static String Method7784(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x12C6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

