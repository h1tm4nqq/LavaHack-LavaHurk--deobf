//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.Zhgf3QiCpopc7WZLbt543132rYDzfYwu;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vo8JGtFXaeonZQiouVGTbpILJYQDvWk4;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
public class CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL Field12889;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12890;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12891;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12892;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12893;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12894;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12895;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12896;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12897;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12898;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12899;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12900;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12901;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12902;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12903;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12904;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12905;
    protected final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12906;
    protected IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12907;
    protected Map Field12908;
    protected int Field12909;
    protected IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12910;
    @Zhgf3QiCpopc7WZLbt543132rYDzfYwu
    public EntityPlayer Field12911;
    protected boolean Field12912;
    protected boolean Field12913;
    protected int Field12914;
    protected int Field12915;
    protected int Field12916;
    private boolean Field12917;
    protected BlockPos Field12918;
    private int Field12919;

    public CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL() {
        super("AutoTrap", "trapping all players", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        this.Field12890 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Target Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1841366296 ^ 0x402400006DC10518L), 1.0, Double.longBitsToDouble((long)848586236 ^ 0x40340000329465FCL), ((int)1322333021L ^ 0x4ED1335C) != 0));
        this.Field12891 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Disable On Complete", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1613508923 ^ (long)-1613508923)));
        this.Field12892 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8BC61017ACFE311DL ^ 0xCB8F1017ACFE311DL), 0.0, Double.longBitsToDouble((long)1235294582 ^ 0x4059000049A11976L), (boolean)((long)-1768226658 ^ (long)-1768226657)));
        this.Field12893 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)757076738 ^ (long)757076739)));
        this.Field12894 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Blocks Per Tick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1085930855 ^ 0x4020000040B9FD67L), 1.0, Double.longBitsToDouble(0xC92F97913862D6F0L ^ 0x891197913862D6F0L), (boolean)((long)-147105055 ^ (long)-147105056)));
        this.Field12895 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Anti Scaffold", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1528110253 ^ (long)-1528110253)));
        this.Field12896 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Anti Step", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1182066695 ^ (long)-1182066695)));
        this.Field12897 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Surround Placing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1515483060L ^ 0xA5AB904D) != 0));
        this.Field12898 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)437480911 ^ 0x401000001A136DCFL), 1.0, Double.longBitsToDouble(0x56EDADC60BA50BD8L ^ 0x16F9ADC60BA50BD8L), ((int)-1374548051L ^ 0xAE120FAD) != 0));
        this.Field12899 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RayTrace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)620549556L ^ 0x24FCD5B4) != 0));
        this.Field12900 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1790426089L ^ 0x95484416) != 0));
        this.Field12901 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-236105052 ^ (long)-236105052)));
        this.Field12902 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Dynamic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)657124910L ^ 0x272AEE2E) != 0));
        this.Field12903 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Support Blocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM.Field11611));
        this.Field12904 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Retries", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xBD41F285A83A29DAL ^ 0xFD75F285A83A29DAL), (boolean)((long)-1075001780 ^ (long)-1075001779)));
        this.Field12905 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Switch Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14682));
        this.Field12906 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Rotate Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17793));
        this.Field12907 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field12908 = new HashMap();
        this.Field12910 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field12912 = (int)((long)2103531952 ^ (long)2103531952);
        this.Field12915 = (int)((long)951031338 ^ (long)951031338);
        this.Field12916 = (int)((long)-1965097817 ^ (long)-1965097817);
        this.Field12917 = (int)((long)-1410456795 ^ (long)-1410456795);
        this.Field12918 = null;
        super.Method21(((int)-2033673821L ^ 0x86C899A3) != 0);
        Field12889 = this;
    }

    public CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL(String string) {
        super(string, qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        this.Field12890 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Target Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x3BFB6D66C1545E00L ^ 0x7BDF6D66C1545E00L), 1.0, Double.longBitsToDouble(0xE1CD88B6740A840BL ^ 0xA1F988B6740A840BL), (boolean)((long)-2095753336 ^ (long)-2095753335)));
        this.Field12891 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Disable On Complete", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)593472504 ^ (long)593472504)));
        this.Field12892 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xBD9F0EB688A87FB7L ^ 0xFDD60EB688A87FB7L), 0.0, Double.longBitsToDouble(0xDDAF01457066F48DL ^ 0x9DF601457066F48DL), (boolean)((long)-334678339 ^ (long)-334678340)));
        this.Field12893 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1515841548L ^ 0xA5A617F5) != 0));
        this.Field12894 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Blocks Per Tick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1480556123 ^ 0x40200000583F7E5BL), 1.0, Double.longBitsToDouble(0x266DD3082D4DE3C0L ^ 0x6653D3082D4DE3C0L), (boolean)((long)683840216 ^ (long)683840217)));
        this.Field12895 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Anti Scaffold", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1941828146L ^ 0x8C420DCE) != 0));
        this.Field12896 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Anti Step", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1005881654 ^ (long)-1005881654)));
        this.Field12897 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Surround Placing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)523911244 ^ (long)523911245)));
        this.Field12898 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1763197052 ^ 0x401000006918407CL), 1.0, Double.longBitsToDouble(0xE678ACD0F9CE10BAL ^ 0xA66CACD0F9CE10BAL), (boolean)((long)1577089043 ^ (long)1577089043)));
        this.Field12899 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RayTrace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1130456877 ^ (long)-1130456877)));
        this.Field12900 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1560919359L ^ 0xA2F642C0) != 0));
        this.Field12901 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1993288570 ^ (long)-1993288570)));
        this.Field12902 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Dynamic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1640392239L ^ 0x9E3999D1) != 0));
        this.Field12903 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Support Blocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM.Field11611));
        this.Field12904 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Retries", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)772541946 ^ 0x403400002E0C0DFAL), ((int)1702520736L ^ 0x657A67A1) != 0));
        this.Field12905 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Switch Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14682));
        this.Field12906 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Rotate Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17793));
        this.Field12907 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field12908 = new HashMap();
        this.Field12910 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field12912 = (int)1719344199L ^ 0x667B1C47;
        this.Field12915 = (int)-1961566321L ^ 0x8B14DF8F;
        this.Field12916 = (int)867153691L ^ 0x33AFB71B;
        this.Field12917 = (int)((long)-1594919843 ^ (long)-1594919843);
        this.Field12918 = null;
    }

    @Override
    public void Method38() {
        if (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field12918 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field12914 = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Field12908.clear();
    }

    @Override
    public void Method45() {
        if (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field12901.Method365()) {
            this.Field12917 = (int)1957347003L ^ 0x74AABEBB;
            this.Method4469();
            return;
        }
        this.Method20();
    }

    protected void Method20() {
        int n;
        this.Field12911 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field12890.Method368());
        if (this.Field12911 == null) {
            return;
        }
        int n2 = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)-689772638L ^ 0xD6E2E7A2, (int)((long)1028347433 ^ (long)1028347424)) != (int)((long)-1991728469 ^ (long)1991728468)) {
            n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)((long)224139207 ^ (long)224139207), (int)((long)783173081 ^ (long)783173072));
        } else {
            if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.ENDER_CHEST, (int)((long)928780064 ^ (long)928780064), (int)2085424066L ^ 0x7C4D0BCB) == ((int)756070919L ^ 0xD2EF45F8)) return;
            n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)((long)1122167554 ^ (long)1122167554), (int)((long)-2103326190 ^ (long)-2103326181));
        }
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n, this.Field12905.Method359().equalsIgnoreCase("Silent"));
        for (BlockPos blockPos : this.Method4467()) {
            if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5951(blockPos, ((int)-318797599L ^ 0xECFF88E0) != 0, ((int)846102324L ^ 0x326E7F35) != 0, (this.Field12909 <= this.Field12904.Method335() ? (int)((long)1308595783 ^ (long)1308595782) : (int)((long)498554352 ^ (long)498554352)) != 0)) continue;
            this.Method4468(blockPos);
            this.Field12909 += (int)((long)-2127718465 ^ (long)-2127718466);
        }
        this.Field12916 = (int)((long)1313906156 ^ (long)1313906156);
        if (this.Field12905.Method359().equalsIgnoreCase(CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14682.name())) {
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n2, ((int)1959235576L ^ 0x74C78FF9) != 0);
        }
        if (!this.Method4467().isEmpty()) {
            return;
        }
        this.Field12909 = (int)-1843808434L ^ 0x9219B74E;
        if (!this.Field12891.Method365()) return;
        this.Method21(((int)1466957451L ^ 0x576FFE8B) != 0);
    }

    protected ArrayList Method4467() {
        List list = this.Method4472();
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        for (BlockPos blockPos : list) {
            if (!this.Field12903.Method309(mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM.Field11610.name()) && (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4215(blockPos) == null || this.Field12903.Method309(mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM.Field11612.name()) && vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5948(blockPos, (boolean)((long)828455244 ^ (long)828455245), ((int)148358803L ^ 0x8D7C692) != 0))) {
                arrayList.add(blockPos.down());
            }
            if (!this.Field12897.Method365()) continue;
            arrayList.add(blockPos);
        }
        for (BlockPos blockPos : this.Method4474()) {
            arrayList.add(blockPos.up());
            if (!this.Field12896.Method365()) continue;
            arrayList.add(blockPos.up().up());
        }
        Iterator iterator = this.Method4477().iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            blockPos = (BlockPos)iterator.next();
            if (this.Field12896.Method365()) {
                arrayList.add(blockPos.up().up().up());
            }
            if (!this.Field12895.Method365()) continue;
            arrayList.add(blockPos.up().up().up().up());
        }
        return arrayList;
    }

    protected void Method4468(BlockPos blockPos) {
        if (this.Field12916 >= this.Field12894.Method335()) return;
        float[] fArray = new float[((int)-241760721L ^ 0xF197062E) << 1];
        fArray[(int)((long)753576832 ^ (long)753576832)] = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        fArray[(int)((long)2124691444 ^ (long)2124691445)] = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        float[] fArray2 = fArray;
        if (!this.Field12906.Method359().equalsIgnoreCase(CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17791.name())) {
            float[] fArray3 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6176(blockPos);
            CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray3[(int)1588584173L ^ 0x5EAFDEED];
            CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray3[(int)799683838L ^ 0x2FAA34FF];
        }
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5949(blockPos, EnumHand.MAIN_HAND, this.Field12900.Method365());
        this.Field12916 += (int)-1501704513L ^ 0xA67DCEBE;
        if (!this.Field12906.Method359().equalsIgnoreCase(CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17793.name())) return;
        CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray2[(int)-627232984L ^ 0xDA9D2F28];
        CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray2[(int)((long)-2120887942 ^ (long)-2120887941)];
    }

    private void Method4469() {
        if (this.Method28()) {
            return;
        }
        this.Method4470();
        if (!this.Field12912) return;
        this.Field12907.Method2801();
    }

    private void Method4470() {
        List list = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4194(this.Field12911.getPositionVector(), this.Field12895.Method365(), this.Field12896.Method365(), this.Field12897.Method365(), (boolean)((long)622558408 ^ (long)622558408), ((int)-1164655159L ^ 0xBA94C5C9) != 0, this.Field12899.Method365());
        this.Method4471(list);
    }

    private void Method4471(List list) {
        list.sort(CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL::Method4483);
        list.sort(Comparator.comparingDouble(CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL::Method4482));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Vec3d vec3d = (Vec3d)iterator.next();
            BlockPos blockPos = new BlockPos(vec3d);
            int n = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4190(blockPos, this.Field12899.Method365());
            if (n == (int)((long)-1395383186 ^ (long)-1395383185) && (this.Field12908.get(blockPos) == null || (Integer)this.Field12908.get(blockPos) < ((int)86541832L ^ 0x5288609) << 2)) {
                this.Method4481(blockPos);
                this.Field12908.put(blockPos, this.Field12908.get(blockPos) == null ? (int)415139872L ^ 0x18BE8821 : (Integer)this.Field12908.get(blockPos) + (int)((long)928595921 ^ (long)928595920));
                this.Field12910.Method2801();
                continue;
            }
            if (n != (int)((long)733975151 ^ (long)733975148)) continue;
            this.Method4481(blockPos);
        }
    }

    protected boolean Method28() {
        int n;
        if (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return ((int)1228329416L ^ 0x4936D1C8) != 0;
        if (this.Field12918 == null) {
            return ((int)1228329416L ^ 0x4936D1C8) != 0;
        }
        this.Field12912 = (int)-510633038L ^ 0xE1905BB2;
        this.Field12915 = (int)((long)364156525 ^ (long)364156525);
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)-173937644L ^ 0xF5A1EC14, (int)((long)-1475720848 ^ (long)-1475720839));
        if (n2 == (int)((long)-1474156984 ^ (long)1474156983)) {
            this.Method21((boolean)((long)904762469 ^ (long)904762469));
        }
        int n3 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)900633124L ^ 0x35AE9224, (int)-1189507202L ^ 0xB9198F77);
        if (!super.Method35()) {
            return ((int)-182931735L ^ 0xF518AEE8) != 0;
        }
        if (!this.Field12918.equals((Object)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player))) {
            this.Method21((boolean)((long)1953229355 ^ (long)1953229355));
            return (int)((long)183614856 ^ (long)183614857) != 0;
        }
        if (this.Field12910.Method2797(0x600617FAL & 0xA0847D1L)) {
            this.Field12908.clear();
            this.Field12910.Method2801();
        }
        if (n3 == ((int)-656854800L ^ 0x2726CF0F)) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886(ChatFormatting.RED + "No Obsidian in hotbar, AutoTrap disabling...");
            this.Method21((boolean)((long)574169726 ^ (long)574169726));
            return ((int)-514138501L ^ 0xE15ADE7A) != 0;
        }
        if (CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != this.Field12914 && CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != n3) {
            this.Field12914 = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        }
        this.Field12913 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1922(this.Field12913);
        this.Field12911 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field12890.Method368());
        if (this.Field12911 != null && this.Field12907.Method2797(this.Field12892.Method335())) {
            n = (int)-1895049359L ^ 0x8F0BD771;
            return n != 0;
        }
        n = (int)-2121567713L ^ 0x818B721E;
        return n != 0;
    }

    private List Method4472() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = this.Method4475().iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Method4473(blockPos)) continue;
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private boolean Method4473(BlockPos blockPos) {
        boolean bl;
        if (!CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            bl = (int)1656357339L ^ 0x62BA01DA;
            return bl;
        }
        bl = (int)-1094189810L ^ 0xBEC7FD0E;
        return bl;
    }

    private List Method4474() {
        ArrayList arrayList = new ArrayList();
        if (this.Field12902.Method365()) {
            int n;
            int n2;
            double d = Math.abs(this.Field12911.posX) - Math.floor(Math.abs(this.Field12911.posX));
            double d2 = Math.abs(this.Field12911.posZ) - Math.floor(Math.abs(this.Field12911.posZ));
            int n3 = this.Method4479(d, ((int)319630563L ^ 0x130D2CE3) != 0);
            int n4 = this.Method4479(d, (boolean)((long)-1435209843 ^ (long)-1435209844));
            int n5 = this.Method4479(d2, (boolean)((long)-1585064633 ^ (long)-1585064633));
            int n6 = this.Method4479(d2, (boolean)((long)120463411 ^ (long)120463410));
            ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
            for (n2 = (int)((long)1636253946 ^ (long)1636253947); n2 < n3 + ((int)245004725L ^ 0xE9A79B4); ++n2) {
                arrayList2.add(this.Method4480(this.Method4476(), n2, (int)((long)802030129 ^ (long)802030128) + n5));
                arrayList2.add(this.Method4480(this.Method4476(), n2, -((int)((long)1910636272 ^ (long)1910636273) + n6)));
            }
            for (n2 = (int)1457670099L ^ 0x56E247D3; n2 <= n4; ++n2) {
                arrayList2.add(this.Method4480(this.Method4476(), -n2, ((int)-1489245086L ^ 0xA73BEC63) + n5));
                arrayList2.add(this.Method4480(this.Method4476(), -n2, -(((int)-403492892L ^ 0xE7F32FE5) + n6)));
            }
            for (n = (int)-898691944L ^ 0xCA6F0C99; n < n5 + ((int)-623690875L ^ 0xDAD33B84); ++n) {
                arrayList2.add(this.Method4480(this.Method4476(), (int)((long)620967013 ^ (long)620967012) + n3, n));
                arrayList2.add(this.Method4480(this.Method4476(), -((int)((long)2023106544 ^ (long)2023106545) + n4), n));
            }
            n = (int)1271637710L ^ 0x4BCBA6CE;
            while (true) {
                if (n > n6) {
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                arrayList2.add(this.Method4480(this.Method4476(), (int)((long)-826872356 ^ (long)-826872355) + n3, -n));
                arrayList2.add(this.Method4480(this.Method4476(), -(((int)944053430L ^ 0x38451CB7) + n4), -n));
                ++n;
            }
        }
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n7 = (int)((long)1535464702 ^ (long)1535464702);
        while (n7 < n) {
            EnumFacing enumFacing = enumFacingArray[n7];
            arrayList.add(this.Method4476().add(enumFacing.getXOffset(), (int)452308397L ^ 0x1AF5ADAD, enumFacing.getZOffset()));
            ++n7;
        }
        return arrayList;
    }

    private List Method4475() {
        ArrayList arrayList = new ArrayList();
        if (this.Field12902.Method365()) {
            int n;
            int n2;
            double d = Math.abs(this.Field12911.posX) - Math.floor(Math.abs(this.Field12911.posX));
            double d2 = Math.abs(this.Field12911.posZ) - Math.floor(Math.abs(this.Field12911.posZ));
            int n3 = this.Method4479(d, (boolean)((long)-770776467 ^ (long)-770776467));
            int n4 = this.Method4479(d, (boolean)((long)323996303 ^ (long)323996302));
            int n5 = this.Method4479(d2, ((int)-715487371L ^ 0xD55A8775) != 0);
            int n6 = this.Method4479(d2, ((int)1774269586L ^ 0x69C13493) != 0);
            ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
            arrayList.addAll(this.Method4477());
            for (n2 = (int)-1848001330L ^ 0x91D9BCCF; n2 < n3 + (int)((long)1684582684 ^ (long)1684582685); ++n2) {
                arrayList2.add(this.Method4480(this.Method4476(), n2, ((int)-739878748L ^ 0xD3E658A5) + n5));
                arrayList2.add(this.Method4480(this.Method4476(), n2, -(((int)-115665073L ^ 0xF91B174E) + n6)));
            }
            for (n2 = (int)((long)-873869246 ^ (long)-873869246); n2 <= n4; ++n2) {
                arrayList2.add(this.Method4480(this.Method4476(), -n2, ((int)-1207487422L ^ 0xB8073443) + n5));
                arrayList2.add(this.Method4480(this.Method4476(), -n2, -((int)((long)-19592448 ^ (long)-19592447) + n6)));
            }
            for (n = (int)((long)1741775568 ^ (long)1741775569); n < n5 + ((int)-2005352849L ^ 0x8878BE6E); ++n) {
                arrayList2.add(this.Method4480(this.Method4476(), ((int)-1891181112L ^ 0x8F46DDC9) + n3, n));
                arrayList2.add(this.Method4480(this.Method4476(), -(((int)1516960421L ^ 0x5A6AFAA4) + n4), n));
            }
            n = (int)((long)-520649248 ^ (long)-520649248);
            while (true) {
                if (n > n6) {
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                arrayList2.add(this.Method4480(this.Method4476(), ((int)1219922072L ^ 0x48B68899) + n3, -n));
                arrayList2.add(this.Method4480(this.Method4476(), -(((int)-1004991465L ^ 0xC4190C16) + n4), -n));
                ++n;
            }
        }
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n7 = (int)276039575L ^ 0x10740797;
        while (n7 < n) {
            EnumFacing enumFacing = enumFacingArray[n7];
            arrayList.add(this.Method4476().add(enumFacing.getXOffset(), (int)((long)1812727152 ^ (long)1812727152), enumFacing.getZOffset()));
            ++n7;
        }
        return arrayList;
    }

    private BlockPos Method4476() {
        double d;
        double d2 = this.Field12911.posX;
        if (this.Field12911.posY - Math.floor(this.Field12911.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x1CF4CE40AB30CCD2L ^ 0x5CC7AAF8AC97DC25L)) ^ 0x7FDAFD21DFBE896DL & 0x7FDAFD219E3F8D7DL)) {
            d = Math.floor(this.Field12911.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x754B5D1A89C89DDEL ^ 0x3558FC116D6C38CEL)) ^ 0x7FE3A10BE5ECA550L & 0x7FE3A10BECA5A532L);
            return new BlockPos(d2, d, this.Field12911.posZ);
        }
        d = Math.floor(this.Field12911.posY);
        return new BlockPos(d2, d, this.Field12911.posZ);
    }

    private List Method4477() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n = this.Method4478(this.Field12911.posX - Math.floor(this.Field12911.posX));
        int n2 = this.Method4478(this.Field12911.posZ - Math.floor(this.Field12911.posZ));
        arrayList.add(this.Method4476());
        int n3 = (int)866699623L ^ 0x33A8C967;
        while (n3 <= Math.abs(n)) {
            for (int i = (int)-1371713615L ^ 0xAE3D4FB1; i <= Math.abs(n2); ++i) {
                int n4 = n3 * n;
                int n5 = i * n2;
                arrayList.add(this.Method4476().add(n4, (int)((long)-1152799636 ^ (long)1152799635), n5));
            }
            ++n3;
        }
        return arrayList;
    }

    private int Method4478(double d) {
        int n;
        if (d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x4E3BC2DFE94F46F0L ^ 0xE0DF0EE0CBB636FL)) ^ 0x7FD0545793D66BFBL & 0x7FD054578F9243F9L)) {
            n = (int)((long)520870303 ^ (long)520870302);
            return n;
        }
        if (d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)765248200 ^ 0x401C24713BD4D520L)) ^ 0x7FCF1742257B34FBL & 0x7FCF1742277B67DFL)) {
            n = (int)((long)1693376589 ^ (long)-1693376590);
            return n;
        }
        n = (int)((long)-1637307493 ^ (long)-1637307493);
        return n;
    }

    private int Method4479(double d, boolean bl) {
        int n;
        if (bl) {
            int n2;
            if (d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1420838851 ^ 0x403E8FD0CFE6CCECL)) ^ 0x7FEDBCE3EA75BC1CL & 0x7FEDBCE3BC67F83EL)) {
                n2 = (int)-428532575L ^ 0xE6751CA0;
                return n2;
            }
            n2 = (int)((long)1265340097 ^ (long)1265340097);
            return n2;
        }
        if (d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)343314738 ^ 0x403659BB09024309L)) ^ 0x7FD03FDD7F57F65FL & 0x7FD03FDD7BB2BCFDL)) {
            n = (int)603472530L ^ 0x23F84293;
            return n;
        }
        n = (int)((long)-29418904 ^ (long)-29418904);
        return n;
    }

    private BlockPos Method4480(BlockPos blockPos, double d, double d2) {
        if (blockPos.getX() < 0) {
            d = -d;
        }
        if (blockPos.getZ() >= 0) {
            return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)555623327 ^ 0x7FEA77598AF9D45EL)) ^ 0x7FEA7759ABF7F7C9L & 0x7FEA7759EBE7F7C1L), d2);
        }
        d2 = -d2;
        return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)555623327 ^ 0x7FEA77598AF9D45EL)) ^ 0x7FEA7759ABF7F7C9L & 0x7FEA7759EBE7F7C1L), d2);
    }

    private void Method4481(BlockPos blockPos) {
        if (this.Field12915 >= this.Field12894.Method335()) return;
        double d = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos);
        double d2 = Double.longBitsToDouble(0xC3C08161D3C086F4L ^ 0x83D48161D3C086F4L);
        return (void)(d2 * d2);
    }

    private static double Method4482(Vec3d vec3d) {
        return vec3d.y;
    }

    private static int Method4483(Vec3d vec3d, Vec3d vec3d2) {
        return Double.compare(CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2061210056 ^ (long)-2061210056);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-638318413 ^ (long)-638318516);
            int n2 = (int)-174454133L ^ 0xF59A0A36;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1567311726 ^ (long)-1567314201) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

