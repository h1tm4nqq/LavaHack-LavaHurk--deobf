//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.util.vector.Quaternion
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.util.vector.Quaternion;

public class LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA {
    public static Quaternion[] Field10082;
    public static int[][][] Field10083;
    public static int[][] Field10084;
    public static int[][] Field10085;
    private String Field10086 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static double Method2299(double d) {
        double d2;
        if (d < Double.longBitsToDouble((long)1639294305 ^ 0x3FE0000061B5A561L)) {
            d2 = Double.longBitsToDouble((long)844402972 ^ 0x401000003254911CL) * d * d * d;
            return d2;
        }
        d2 = 1.0 - Math.pow(Double.longBitsToDouble((long)5569674 ^ 0xC00000000054FC8AL) * d + Double.longBitsToDouble((long)1381709430 ^ 0x40000000525B3676L), Double.longBitsToDouble((long)598798587 ^ 0x4008000023B0F0FBL)) / Double.longBitsToDouble((long)824149124 ^ 0x40000000311F8484L);
        return d2;
    }

    public static void Method2300(ModelRenderer modelRenderer, float f, int n, int n2, int n3) {
        int n4 = Field10083[n + ((int)871240830L ^ 0x33EE147F)][n2 + (int)((long)-1851759831 ^ (long)-1851759832)][n3 + (int)((long)1674300423 ^ (long)1674300422)];
        if (Arrays.stream(Field10084[WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12740]).anyMatch(arg_0 -> LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Method2306(n4, arg_0))) {
            return;
        }
        LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Method2303(modelRenderer, f, n, n2, n3, n4);
    }

    public static void Method2301(ModelRenderer modelRenderer, float f, int n, int n2, int n3) {
        int n4 = Field10083[n + ((int)283269318L ^ 0x10E258C7)][n2 + (int)((long)-1855478543 ^ (long)-1855478544)][n3 + (int)((long)34458204 ^ (long)34458205)];
        if (Arrays.stream(Field10084[WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12740]).noneMatch(arg_0 -> LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Method2305(n4, arg_0))) {
            return;
        }
        int[] nArray = Field10085[WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12740];
        LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Method2303(modelRenderer, f, n - nArray[(int)((long)-57602067 ^ (long)-57602067)], n2 - nArray[(int)2074692467L ^ 0x7BA94B72], n3 - nArray[((int)0xCBABBAL ^ 0xCBABBB) << 1], n4);
    }

    public static void Method2302(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = Field10083[n + ((int)1105309786L ^ 0x41E1B05B)][n2 + (int)((long)-1030950866 ^ (long)-1030950865)][n3 + (int)((long)707205640 ^ (long)707205641)];
        if (Arrays.stream(Field10084[WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf.Field12740]).noneMatch(arg_0 -> LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Method2304(n7, arg_0))) {
            return;
        }
        float f = (float)Math.toRadians(Double.longBitsToDouble((long)1926619931 ^ 0x4056800072D5E31BL));
        float f2 = (float)((double)n4 * Math.sin(f / 2.0f));
        float f3 = (float)((double)n5 * Math.sin(f / 2.0f));
        float f4 = (float)((double)n6 * Math.sin(f / 2.0f));
        float f5 = (float)Math.cos(f / 2.0f);
        LHuzA8wCyJ42s4yRGB91I9dHLY5mwICA.Field10082[n7] = Quaternion.mul((Quaternion)new Quaternion(f2, f3, f4, f5), (Quaternion)Field10082[n7], null);
    }

    public static void Method2303(ModelRenderer modelRenderer, float f, int n, int n2, int n3, int n4) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((double)((double)n * Double.longBitsToDouble(0x96E89BCC0F70C567L ^ 0xA931025596E95CFDL)), (double)((double)n2 * Double.longBitsToDouble((long)1007593564 ^ 0x3FD99999A59731C6L)), (double)((double)n3 * Double.longBitsToDouble((long)1017608169 ^ 0x3FD99999A53EEE73L)));
        GlStateManager.rotate((Quaternion)Field10082[n4]);
        modelRenderer.render(f);
        GlStateManager.popMatrix();
    }

    private static boolean Method2304(int n, int n2) {
        int n3;
        if (n2 == n) {
            n3 = (int)((long)-1605139416 ^ (long)-1605139415);
            return n3 != 0;
        }
        n3 = (int)((long)854729296 ^ (long)854729296);
        return n3 != 0;
    }

    private static boolean Method2305(int n, int n2) {
        boolean bl;
        if (n2 == n) {
            bl = (int)-1033065355L ^ 0xC26CAC74;
            return bl;
        }
        bl = (int)1125670497L ^ 0x43185E61;
        return bl;
    }

    private static boolean Method2306(int n, int n2) {
        int n3;
        if (n2 == n) {
            n3 = (int)((long)439140660 ^ (long)439140661);
            return n3 != 0;
        }
        n3 = (int)((long)-489487961 ^ (long)-489487961);
        return n3 != 0;
    }

    static {
        Quaternion[] quaternionArray = new Quaternion[(int)((long)-1133002880 ^ (long)-1133002867) << 1];
        quaternionArray[(int)-2046622298L ^ 0x860305A6] = new Quaternion();
        quaternionArray[(int)((long)1266144876 ^ (long)1266144877)] = new Quaternion();
        quaternionArray[(int)((long)1999173806 ^ (long)1999173807) << 1] = new Quaternion();
        quaternionArray[(int)((long)-1708818400 ^ (long)-1708818397)] = new Quaternion();
        quaternionArray[(int)((long)-576393890 ^ (long)-576393889) << 2] = new Quaternion();
        quaternionArray[(int)((long)-881715590 ^ (long)-881715585)] = new Quaternion();
        quaternionArray[(int)((long)306135537 ^ (long)306135538) << 1] = new Quaternion();
        quaternionArray[(int)((long)-1349722668 ^ (long)-1349722669)] = new Quaternion();
        quaternionArray[(int)((long)391034514 ^ (long)391034515) << 3] = new Quaternion();
        quaternionArray[(int)2055520646L ^ 0x7A84C18F] = new Quaternion();
        quaternionArray[((int)-1064318199L ^ 0xC08FCB0C) << 1] = new Quaternion();
        quaternionArray[(int)((long)108435221 ^ (long)108435230)] = new Quaternion();
        quaternionArray[(int)((long)-1882422955 ^ (long)-1882422954) << 2] = new Quaternion();
        quaternionArray[(int)-915976660L ^ 0xC9674E21] = new Quaternion();
        quaternionArray[((int)711693646L ^ 0x2A6B9549) << 1] = new Quaternion();
        quaternionArray[(int)-332952048L ^ 0xEC278E1F] = new Quaternion();
        quaternionArray[(int)((long)-1921779859 ^ (long)-1921779860) << 4] = new Quaternion();
        quaternionArray[(int)1985554192L ^ 0x76592701] = new Quaternion();
        quaternionArray[(int)((long)701750216 ^ (long)701750209) << 1] = new Quaternion();
        quaternionArray[(int)-186844904L ^ 0xF4DCF90B] = new Quaternion();
        quaternionArray[((int)-478481516L ^ 0xE37AF391) << 2] = new Quaternion();
        quaternionArray[(int)((long)1672957944 ^ (long)1672957933)] = new Quaternion();
        quaternionArray[(int)((long)783372391 ^ (long)783372396) << 1] = new Quaternion();
        quaternionArray[(int)((long)-1190474635 ^ (long)-1190474654)] = new Quaternion();
        quaternionArray[(int)((long)-1829952028 ^ (long)-1829952025) << 3] = new Quaternion();
        quaternionArray[(int)-1591118967L ^ 0xA1297390] = new Quaternion();
        Field10082 = quaternionArray;
        int[][][] nArrayArray = new int[(int)((long)1162694229 ^ (long)1162694230)][][];
        int[][] nArrayArray2 = new int[(int)((long)-365865954 ^ (long)-365865955)][];
        int[] nArray = new int[(int)((long)1621078239 ^ (long)1621078236)];
        nArray[(int)((long)1474969424 ^ (long)1474969424)] = (int)-52288710L ^ 0xFCE2232B;
        nArray[(int)((long)1814755397 ^ (long)1814755396)] = (int)-263718563L ^ 0xF047F954;
        nArray[(int)((long)772157068 ^ (long)772157069) << 1] = (int)((long)-1013952718 ^ (long)-1013952718);
        nArrayArray2[(int)-877487701L ^ 0xCBB299AB] = nArray;
        int[] nArray2 = new int[(int)12175863L ^ 0xB9C9F4];
        nArray2[(int)-259245185L ^ 0xF08C3B7F] = ((int)-1377762311L ^ 0xADE103FC) << 2;
        nArray2[(int)-1566203230L ^ 0xA2A5A2A3] = (int)((long)-1404992284 ^ (long)-1404992283) << 4;
        nArray2[(int)((long)-1426770885 ^ (long)-1426770886) << 1] = (int)2019793018L ^ 0x78639879;
        nArrayArray2[(int)2024787402L ^ 0x78AFCDCB] = nArray2;
        int[] nArray3 = new int[(int)333061133L ^ 0x13DA1C0E];
        nArray3[(int)((long)-235050156 ^ (long)-235050156)] = (int)-341587553L ^ 0xEBA3C988;
        nArray3[(int)-911970583L ^ 0xC9A46EE8] = (int)((long)238430751 ^ (long)238430736);
        nArray3[((int)-917168771L ^ 0xC9551D7C) << 1] = ((int)1966323579L ^ 0x7533B778) << 1;
        nArrayArray2[((int)1942906215L ^ 0x73CE6566) << 1] = nArray3;
        nArrayArray[(int)84462546L ^ 0x508CBD2] = nArrayArray2;
        int[][] nArrayArray3 = new int[(int)626840703L ^ 0x255CD47C][];
        int[] nArray4 = new int[(int)((long)-2036195324 ^ (long)-2036195321)];
        nArray4[(int)-31704919L ^ 0xFE1C38A9] = (int)((long)-1577176512 ^ (long)-1577176503) << 1;
        nArray4[(int)-221047527L ^ 0xF2D31518] = ((int)-108908397L ^ 0xF9823096) << 1;
        nArray4[(int)((long)1415044873 ^ (long)1415044872) << 1] = (int)((long)-1299690852 ^ (long)-1299690851);
        nArrayArray3[(int)703215114L ^ 0x29EA360A] = nArray4;
        int[] nArray5 = new int[(int)-2136820589L ^ 0x80A2B490];
        nArray5[(int)((long)672896888 ^ (long)672896888)] = (int)-1496365073L ^ 0xA6CF47FA;
        nArray5[(int)393508088L ^ 0x177474F9] = (int)((long)-1376685265 ^ (long)1376685264);
        nArray5[((int)-521823987L ^ 0xE0E5990C) << 1] = ((int)147236184L ^ 0x8C6A559) << 2;
        nArrayArray3[(int)((long)108445275 ^ (long)108445274)] = nArray5;
        int[] nArray6 = new int[(int)176348228L ^ 0xA82DC47];
        nArray6[(int)-1419282695L ^ 0xAB6776F9] = (int)((long)-1974621790 ^ (long)-1974621791) << 3;
        nArray6[(int)1984778073L ^ 0x764D4F58] = (int)((long)-321842303 ^ (long)-321842298) << 1;
        nArray6[((int)854213715L ^ 0x32EA4452) << 1] = (int)((long)1874061095 ^ (long)1874061088);
        nArrayArray3[(int)((long)-1977447830 ^ (long)-1977447829) << 1] = nArray6;
        nArrayArray[(int)((long)-1335552929 ^ (long)-1335552930)] = nArrayArray3;
        int[][] nArrayArray4 = new int[(int)-1801617490L ^ 0x949D7FAD][];
        int[] nArray7 = new int[(int)((long)60087502 ^ (long)60087501)];
        nArray7[(int)((long)196736533 ^ (long)196736533)] = (int)493062632L ^ 0x1D6389FB;
        nArray7[(int)((long)-722127458 ^ (long)-722127457)] = (int)((long)436402578 ^ (long)436402585);
        nArray7[(int)((long)1794364578 ^ (long)1794364579) << 1] = (int)((long)1455788474 ^ (long)1455788475) << 1;
        nArrayArray4[(int)1528178818L ^ 0x5B162882] = nArray7;
        int[] nArray8 = new int[(int)-40245902L ^ 0xFD99E571];
        nArray8[(int)((long)543065 ^ (long)543065)] = (int)((long)863818766 ^ (long)863818757) << 1;
        nArray8[(int)((long)202891130 ^ (long)202891131)] = ((int)1952784146L ^ 0x74651F11) << 2;
        nArray8[((int)1432662133L ^ 0x5564B074) << 1] = (int)((long)-2104565852 ^ (long)-2104565855);
        nArrayArray4[(int)((long)193569819 ^ (long)193569818)] = nArray8;
        int[] nArray9 = new int[(int)((long)1659729277 ^ (long)1659729278)];
        nArray9[(int)((long)881822769 ^ (long)881822769)] = (int)-1383541772L ^ 0xAD88D3ED;
        nArray9[(int)((long)885130680 ^ (long)885130681)] = (int)-60722596L ^ 0xFC617251;
        nArray9[(int)((long)1929306307 ^ (long)1929306306) << 1] = (int)((long)2067244014 ^ (long)2067244015) << 3;
        nArrayArray4[((int)-1934291058L ^ 0x8CB50F8F) << 1] = nArray9;
        nArrayArray[((int)-1578844355L ^ 0xA1E4BF3C) << 1] = nArrayArray4;
        Field10083 = nArrayArray;
        int[][] nArrayArray5 = new int[(int)((long)-573470045 ^ (long)-573470048) << 1][];
        int[] nArray10 = new int[(int)((long)-1008380739 ^ (long)-1008380748)];
        nArray10[(int)910813912L ^ 0x3649EAD8] = (int)1041525714L ^ 0x3E146BD2;
        nArray10[(int)-40060580L ^ 0xFD9CB95D] = (int)((long)364546580 ^ (long)364546581);
        nArray10[((int)-960828776L ^ 0xC6BAEA99) << 1] = ((int)-797590184L ^ 0xD075BD59) << 1;
        nArray10[(int)((long)-696256842 ^ (long)-696256843)] = (int)((long)1830931391 ^ (long)1830931388);
        nArray10[(int)((long)-560221697 ^ (long)-560221698) << 2] = (int)((long)-911214034 ^ (long)-911214033) << 2;
        nArray10[(int)((long)-1957860883 ^ (long)-1957860888)] = (int)-116865965L ^ 0xF908C456;
        nArray10[(int)((long)-540307716 ^ (long)-540307713) << 1] = (int)((long)-1816251587 ^ (long)-1816251586) << 1;
        nArray10[(int)((long)1037043855 ^ (long)1037043848)] = (int)((long)1242964410 ^ (long)1242964413);
        nArray10[(int)((long)-1312247444 ^ (long)-1312247443) << 3] = ((int)143044052L ^ 0x886ADD5) << 3;
        nArrayArray5[(int)169217445L ^ 0xA160DA5] = nArray10;
        int[] nArray11 = new int[(int)-377227875L ^ 0xE983F594];
        nArray11[(int)((long)320708581 ^ (long)320708581)] = (int)((long)1813197236 ^ (long)1813197223);
        nArray11[(int)980664579L ^ 0x3A73C102] = (int)((long)-1344474941 ^ (long)-1344474934) << 1;
        nArray11[(int)((long)-1825267273 ^ (long)-1825267274) << 1] = (int)373378255L ^ 0x16414CDE;
        nArray11[(int)((long)-635057821 ^ (long)-635057824)] = ((int)-1349153602L ^ 0xAF958CB5) << 1;
        nArray11[((int)627755469L ^ 0x256AC9CC) << 2] = (int)((long)1501627757 ^ (long)1501627768);
        nArray11[(int)506642890L ^ 0x1E32C1CF] = ((int)-1021807401L ^ 0xC31874D2) << 2;
        nArray11[((int)620825963L ^ 0x25010D68) << 1] = (int)-127666937L ^ 0xF863F51E;
        nArray11[(int)((long)-297419950 ^ (long)-297419947)] = (int)((long)1932985961 ^ (long)1932985962) << 3;
        nArray11[((int)-1373900525L ^ 0xAE1BF112) << 3] = (int)-1557374690L ^ 0xA32C5909;
        nArrayArray5[(int)-890780405L ^ 0xCAE7C50A] = nArray11;
        int[] nArray12 = new int[(int)130731916L ^ 0x7CACF85];
        nArray12[(int)-1220253821L ^ 0xB7446783] = (int)-560171421L ^ 0xDE9C7663;
        nArray12[(int)((long)-1704065738 ^ (long)-1704065737)] = (int)((long)819648907 ^ (long)819648906);
        nArray12[(int)((long)704686503 ^ (long)704686502) << 1] = ((int)1070406982L ^ 0x3FCD1D47) << 1;
        nArray12[(int)((long)724813195 ^ (long)724813192)] = (int)-598691959L ^ 0xDC50AF80;
        nArray12[((int)-802446882L ^ 0xD02BA1DF) << 2] = ((int)131998280L ^ 0x7DE224D) << 1;
        nArray12[(int)1169199163L ^ 0x45B0903E] = (int)((long)613466903 ^ (long)613466908);
        nArray12[(int)((long)19691581 ^ (long)19691582) << 1] = (int)-1690991453L ^ 0x9B3584B2;
        nArray12[(int)-129185556L ^ 0xF84CC8EB] = (int)((long)-568785721 ^ (long)-568785714) << 1;
        nArray12[(int)((long)576076988 ^ (long)576076989) << 3] = (int)-940322979L ^ 0xC7F3CF4E;
        nArrayArray5[(int)((long)1535270643 ^ (long)1535270642) << 1] = nArray12;
        int[] nArray13 = new int[(int)((long)814832781 ^ (long)814832772)];
        nArray13[(int)((long)-5303962 ^ (long)-5303962)] = (int)((long)556649969 ^ (long)556649958);
        nArray13[(int)-850357659L ^ 0xCD509264] = (int)((long)-2137767047 ^ (long)-2137767046) << 3;
        nArray13[((int)-1008719922L ^ 0xC3E027CF) << 1] = (int)810181462L ^ 0x304A634F;
        nArray13[(int)1772201327L ^ 0x69A1A56C] = (int)((long)761318807 ^ (long)761318808);
        nArray13[(int)((long)1385197602 ^ (long)1385197603) << 2] = ((int)-269192919L ^ 0xEFF4712E) << 1;
        nArray13[(int)1184900891L ^ 0x46A0271E] = (int)((long)-1098862442 ^ (long)-1098862437);
        nArray13[(int)((long)1470875589 ^ (long)1470875590) << 1] = (int)((long)-1012994923 ^ (long)-1012994922) << 1;
        nArray13[(int)((long)-841871926 ^ (long)-841871923)] = (int)1986092667L ^ 0x76615E7C;
        nArray13[(int)((long)-1019416913 ^ (long)-1019416914) << 3] = ((int)-53912451L ^ 0xFCC95C7C) << 3;
        nArrayArray5[(int)-394350012L ^ 0xE87EB247] = nArray13;
        int[] nArray14 = new int[(int)-250958916L ^ 0xF10AABB5];
        nArray14[(int)-1281207209L ^ 0xB3A25457] = (int)-539731683L ^ 0xDFD4590C;
        nArray14[(int)-615243754L ^ 0xDB542017] = (int)-1836962586L ^ 0x92822CEF;
        nArray14[((int)-1843642778L ^ 0x921C3E67) << 1] = (int)1441128518L ^ 0x55E5E046;
        nArray14[(int)197430819L ^ 0xBC48E20] = (int)((long)663400246 ^ (long)663400243) << 2;
        nArray14[((int)-659761906L ^ 0xD8ACD50F) << 2] = (int)((long)1864562764 ^ (long)1864562765) << 4;
        nArray14[(int)((long)1721334447 ^ (long)1721334442)] = (int)((long)-165580208 ^ (long)-165580205);
        nArray14[((int)792517910L ^ 0x2F3CDD15) << 1] = (int)223221224L ^ 0xD4E15FF;
        nArray14[(int)-1492116992L ^ 0xA7101A07] = (int)2060267258L ^ 0x7ACD2EF5;
        nArray14[(int)((long)2086132021 ^ (long)2086132020) << 3] = ((int)-1043711868L ^ 0xC1CA3887) << 1;
        nArrayArray5[((int)1900206446L ^ 0x7142D96F) << 2] = nArray14;
        int[] nArray15 = new int[(int)((long)-1807513916 ^ (long)-1807513907)];
        nArray15[(int)((long)-1338189374 ^ (long)-1338189374)] = (int)((long)-1756079555 ^ (long)-1756079556) << 1;
        nArray15[(int)((long)1096172821 ^ (long)1096172820)] = (int)((long)741768110 ^ (long)741768101);
        nArray15[((int)2134574157L ^ 0x7F3B044C) << 1] = (int)142226180L ^ 0x87A3317;
        nArray15[(int)((long)-1028178181 ^ (long)-1028178184)] = (int)((long)-1099218103 ^ (long)-1099218100);
        nArray15[(int)((long)917383112 ^ (long)917383113) << 2] = ((int)1129750386L ^ 0x43569F71) << 2;
        nArray15[(int)-1896556047L ^ 0x8EF4D9F4] = ((int)171789744L ^ 0xA3D4DBB) << 1;
        nArray15[(int)((long)1147562535 ^ (long)1147562532) << 1] = ((int)375601172L ^ 0x16633815) << 3;
        nArray15[(int)894772536L ^ 0x3555253F] = (int)((long)144717191 ^ (long)144717194);
        nArray15[(int)((long)-1979514434 ^ (long)-1979514433) << 3] = (int)((long)2023515310 ^ (long)2023515319);
        nArrayArray5[(int)-726132449L ^ 0xD4B8191A] = nArray15;
        Field10084 = nArrayArray5;
        int[][] nArrayArray6 = new int[(int)((long)1109956209 ^ (long)1109956210) << 1][];
        int[] nArray16 = new int[(int)-1379194475L ^ 0xADCB2996];
        nArray16[(int)2051357736L ^ 0x7A453C28] = (int)339042045L ^ 0x14355EFD;
        nArray16[(int)((long)-1582414374 ^ (long)-1582414373)] = (int)((long)-2117503475 ^ (long)-2117503475);
        nArray16[(int)((long)-1379522090 ^ (long)-1379522089) << 1] = (int)((long)-1660148192 ^ (long)-1660148191);
        nArrayArray6[(int)((long)1648356382 ^ (long)1648356382)] = nArray16;
        int[] nArray17 = new int[(int)321366122L ^ 0x1327A869];
        nArray17[(int)-1142201605L ^ 0xBBEB62FB] = (int)-651182400L ^ 0xD92FBEC0;
        nArray17[(int)-725493097L ^ 0xD4C1DA96] = (int)((long)-961808513 ^ (long)-961808513);
        nArray17[(int)((long)1869678872 ^ (long)1869678873) << 1] = (int)-639186506L ^ 0x26193649;
        nArrayArray6[(int)-726332381L ^ 0xD4B50C22] = nArray17;
        int[] nArray18 = new int[(int)((long)1002061978 ^ (long)1002061977)];
        nArray18[(int)1768507859L ^ 0x696949D3] = (int)((long)153691594 ^ (long)153691594);
        nArray18[(int)1985030319L ^ 0x765128AE] = (int)1399133890L ^ 0x536516C3;
        nArray18[((int)64324340L ^ 0x3D582F5) << 1] = (int)-1729488729L ^ 0x98EA18A7;
        nArrayArray6[(int)((long)-1038050836 ^ (long)-1038050835) << 1] = nArray18;
        int[] nArray19 = new int[(int)((long)-1429362316 ^ (long)-1429362313)];
        nArray19[(int)-99771339L ^ 0xFA0D9C35] = (int)((long)1186174245 ^ (long)1186174245);
        nArray19[(int)-433186526L ^ 0xE62E1923] = (int)-1411127921L ^ 0x541C1A70;
        nArray19[(int)((long)-1242169031 ^ (long)-1242169032) << 1] = (int)-1686583905L ^ 0x9B78C59F;
        nArrayArray6[(int)((long)922418969 ^ (long)922418970)] = nArray19;
        int[] nArray20 = new int[(int)((long)1500264107 ^ (long)1500264104)];
        nArray20[(int)-195356409L ^ 0xF45B1907] = (int)-2080609877L ^ 0x7C039654;
        nArray20[(int)((long)-1872385834 ^ (long)-1872385833)] = (int)-1695683574L ^ 0x9AEDEC0A;
        nArray20[((int)264944084L ^ 0xFCAB9D5) << 1] = (int)1706414600L ^ 0x65B5D208;
        nArrayArray6[((int)952489240L ^ 0x38C5D519) << 2] = nArray20;
        int[] nArray21 = new int[(int)((long)574744524 ^ (long)574744527)];
        nArray21[(int)((long)957373179 ^ (long)957373179)] = (int)((long)2139203221 ^ (long)2139203220);
        nArray21[(int)((long)-1334079425 ^ (long)-1334079426)] = (int)((long)892393510 ^ (long)892393510);
        nArray21[(int)((long)-1438599235 ^ (long)-1438599236) << 1] = (int)1884557841L ^ 0x70541211;
        nArrayArray6[(int)((long)2070429428 ^ (long)2070429425)] = nArray21;
        Field10085 = nArrayArray6;
    }
}

