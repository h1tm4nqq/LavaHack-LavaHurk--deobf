//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.event.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import java.util.*;

public class Class2159
{
    public static boolean Field17865;
    public static boolean Field17866;
    public static boolean Field17867;
    public static boolean Field17868;
    private String Field17869 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2159() {
        final Class884 field16286 = Class1796.Field16241.Field16286;
        ++field16286.Field11713;
    }
    
    public void Method7782() {
        Class1155.Method4678();
        Class1796.Field16242.Method715(new Class279("AI Improved"));
    }
    
    public void Method7783(final EntityJoinWorldEvent entityJoinWorldEvent) {
        if (!Class2159.Field17865) {
            return;
        }
        final Entity entity = entityJoinWorldEvent.getEntity();
        if (entity instanceof EntityLiving) {
            final EntityLiving entityLiving = (EntityLiving)entity;
            if (Class2159.Field17866 || Class2159.Field17867) {
                final Iterator iterator = entityLiving.tasks.taskEntries.iterator();
                while (iterator.hasNext()) {
                    final EntityAITasks$EntityAITaskEntry next = iterator.next();
                    if (next instanceof EntityAITasks$EntityAITaskEntry) {
                        final EntityAITasks$EntityAITaskEntry entityAITasks$EntityAITaskEntry = next;
                        if (!Class2159.Field17866 || !(entityAITasks$EntityAITaskEntry.action instanceof EntityAIWatchClosest)) {
                            if (!Class2159.Field17867) {
                                continue;
                            }
                            if (!(entityAITasks$EntityAITaskEntry.action instanceof EntityAILookIdle)) {
                                continue;
                            }
                        }
                        iterator.remove();
                    }
                }
            }
            if (Class2159.Field17868 && (entityLiving.getLookHelper() == null || entityLiving.getLookHelper().getClass() == EntityLookHelper.class)) {
                final EntityLookHelper lookHelper = entityLiving.lookHelper;
                entityLiving.lookHelper = new Class611(entityLiving);
                entityLiving.lookHelper.posX = lookHelper.posX;
                entityLiving.lookHelper.posY = lookHelper.posY;
                entityLiving.lookHelper.posZ = lookHelper.posZ;
                entityLiving.lookHelper.isLooking = lookHelper.isLooking;
                entityLiving.lookHelper.deltaLookPitch = lookHelper.deltaLookPitch;
                entityLiving.lookHelper.deltaLookYaw = lookHelper.deltaLookYaw;
            }
        }
    }
    
    static {
        Class2159.Field17865 = false;
        Class2159.Field17866 = false;
        Class2159.Field17867 = false;
        Class2159.Field17868 = true;
    }
    
    private static String Method7784(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x12C6 ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
