/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG;
import java.util.ArrayList;
import lavahack.client.qxCK1imRYd7NDp008wyQje0AOX8b9j3I;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;

public class yA6FfBWveAENft82JRISn3FwZ8fifzBI
implements qxCK1imRYd7NDp008wyQje0AOX8b9j3I {
    public static ArrayList Field10472 = new ArrayList();
    public static ArrayList Field10473 = new ArrayList();
    public static ArrayList Field10474 = new ArrayList();
    public static ArrayList Field10475 = new ArrayList();
    private int Field10476;

    private void Method2530() {
        Enum enum_;
        int n;
        Enum[] enumArray = yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.values();
        int n2 = enumArray.length;
        for (n = (int)784511314L ^ 0x2EC2B152; n < n2; ++n) {
            enum_ = enumArray[n];
            if (lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Method7240(enum_, yA6FfBWveAENft82JRISn3FwZ8fifzBI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class)) {
                Field10472.add(enum_);
            }
            if (!lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Method7240(enum_, yA6FfBWveAENft82JRISn3FwZ8fifzBI$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.class)) continue;
            Field10473.add(enum_);
        }
        enumArray = yA6FfBWveAENft82JRISn3FwZ8fifzBI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.values();
        n2 = enumArray.length;
        n = (int)((long)-102869626 ^ (long)-102869626);
        while (n < n2) {
            enum_ = enumArray[n];
            if (lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Method7240(enum_, yA6FfBWveAENft82JRISn3FwZ8fifzBI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class)) {
                Field10474.add(enum_);
            }
            if (lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Method7240(enum_, yA6FfBWveAENft82JRISn3FwZ8fifzBI$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.class)) {
                Field10475.add(enum_);
            }
            ++n;
        }
    }

    static {
        new yA6FfBWveAENft82JRISn3FwZ8fifzBI().Method2530();
    }
}

