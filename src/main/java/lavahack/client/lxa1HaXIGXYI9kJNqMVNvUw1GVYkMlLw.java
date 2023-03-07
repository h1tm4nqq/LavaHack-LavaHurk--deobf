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

import lavahack.client.Wk0rB5tCxaols7h6NITzxtpKMj2yHNue;
import lavahack.client.YupX2HsEuHClak3p6ZEVrKr6HcDPylAS;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw {
    public static boolean Field17865 = (int)((long)-605795885 ^ (long)-605795885);
    public static boolean Field17866 = (int)-94076873L ^ 0xFA648037;
    public static boolean Field17867 = (int)-1888564411L ^ 0x8F6ECB45;
    public static boolean Field17868 = (int)((long)-1725515770 ^ (long)-1725515769);
    private String Field17869 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16286.Field11713 += (int)((long)-100340582 ^ (long)-100340581);
    }

    public void Method7782() {
        Wk0rB5tCxaols7h6NITzxtpKMj2yHNue.Method4678();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ("AI Improved"));
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
        entityLiving.lookHelper = new YupX2HsEuHClak3p6ZEVrKr6HcDPylAS(entityLiving);
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
        int n = (int)((long)-1511997471 ^ (long)-1511997471);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-555858516 ^ (long)-555858605);
            int n2 = ((int)-84960029L ^ 0xFAEF9CEA) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)1315489345L ^ 0x4E68CF22) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

