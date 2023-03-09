/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class1576 {
    public static final String Field15347;
    public static final String Field15348;
    public static final String Field15349;
    public static final String Field15350;
    public static final String Field15351;
    public static final String Field15352;
    public static final String Field15353;
    public static final String Field15354;
    public static final String Field15355;
    public static final String Field15356;
    public static final String Field15357;
    public static final String Field15358;
    public static final String Field15359;
    public static final String Field15360;
    public static final String Field15361;
    public static final String Field15362;
    public static final String Field15363;
    public static final String Field15364;
    public static final String Field15365;
    public static final String Field15366;
    public static final String Field15367;
    public static final String Field15368;
    public static final String Field15369;
    public static final String Field15370;
    public static final String Field15371;
    public static final String Field15372;
    public static final String Field15373;
    public static final String Field15374;
    public static final String Field15375;
    public static final String Field15376;
    public static final String Field15377;
    public static final String Field15378;
    public static final String Field15379;
    public static final String Field15380;
    public static final String Field15381;
    public static final String Field15382;
    public static final String Field15383;
    public static final String Field15384;
    public static final String Field15385;
    public static final String Field15386;
    public static final String Field15387;
    public static final String Field15388;
    public static final String Field15389;
    public static final String Field15390;
    public static final String Field15391;
    public static final String Field15392;
    public static final String Field15393;
    private int Field15394;

    static {
        Field15393 = "schematica.config";
        Field15392 = "Amount of storage provided per-player for schematics on the server.";
        Field15391 = "playerQuotaKilobytes";
        Field15390 = "Allow players to load schematics.";
        Field15389 = "loadEnabled";
        Field15388 = "Allow players to save schematics.";
        Field15387 = "saveEnabled";
        Field15386 = "Allow players to use the printer.";
        Field15385 = "printerEnabled";
        Field15384 = "Default sort type for the material list.";
        Field15383 = "sortType";
        Field15382 = "Extra blocks to consider as air for the schematic renderer.";
        Field15381 = "extraAirBlocks";
        Field15380 = "Schematic directory.";
        Field15379 = "schematicDirectory";
        Field15378 = "Allow the printer to use this hotbar slot.";
        Field15377 = "swapSlot";
        Field15376 = "Place blocks only if there is an adjacent block next to them.";
        Field15375 = "placeAdjacent";
        Field15374 = "Destroy all blocks that can be destroyed in one tick.";
        Field15373 = "destroyInstantly";
        Field15372 = "The printer will destroy blocks (creative mode only).";
        Field15371 = "destroyBlocks";
        Field15370 = "Place all blocks that can be placed in one tick.";
        Field15369 = "placeInstantly";
        Field15368 = "Maximum placement distance.";
        Field15367 = "placeDistance";
        Field15366 = "Timeout before re-trying failed blocks.";
        Field15365 = "timeout";
        Field15364 = "Delay between placement attempts (in ticks).";
        Field15363 = "placeDelay";
        Field15362 = "Schematic render distance.";
        Field15361 = "renderDistance";
        Field15360 = "Delta value used for highlighting (if you experience z-fighting increase this).";
        Field15359 = "blockDelta";
        Field15358 = "Highlight blocks that should be air.";
        Field15357 = "highlightAir";
        Field15356 = "Highlight invalid placed blocks and to be placed blocks.";
        Field15355 = "highlight";
        Field15354 = "Alpha value used when rendering the schematic (1.0 = opaque, 0.5 = half transparent, 0.0 = transparent).";
        Field15353 = "alpha";
        Field15352 = "Enable transparent textures.";
        Field15351 = "alphaEnabled";
        Field15350 = "Display extra information on the debug screen (F3).";
        Field15349 = "showDebugInfo";
        Field15348 = "Dump all block states on startup.";
        Field15347 = "dumpBlockList";
    }

    private static String Method6214(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 66;
            cArray2[n] = (char)(cArray[n] ^ (0x39D7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

