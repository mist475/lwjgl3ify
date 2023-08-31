package org.lwjglx.openal;

public class EFX10 {

    public static final int AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = 3;

    public static final int AL_TRUE = 1;

    public static final int AL_EFFECT_TYPE = 32769;

    public static final int AL_EFFECT_EAXREVERB = 32768;

    public static final int AL_FILTER_TYPE = 32769;

    public static final int AL_FILTER_LOWPASS = 1;

    public static int alGenAuxiliaryEffectSlots() {
        return org.lwjgl.openal.EXTEfx.alGenAuxiliaryEffectSlots();
    }

    public static void alAuxiliaryEffectSloti(int arg0, int arg1, int arg2) {
        org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSloti(arg0, arg1, arg2);
    }

    public static int alGenEffects() {
        return org.lwjgl.openal.EXTEfx.alGenEffects();
    }

    public static void alEffecti(int arg0, int arg1, int arg2) {
        org.lwjgl.openal.EXTEfx.alEffecti(arg0, arg1, arg2);
    }

    public static void alFilteri(int arg0, int arg1, int arg2) {
        org.lwjgl.openal.EXTEfx.alFilteri(arg0, arg1, arg2);
    }

    public static int alGenFilters() {
        return org.lwjgl.openal.EXTEfx.alGenFilters();
    }

    public static void alEffectf(int arg0, int arg1, float arg2) {
        org.lwjgl.openal.EXTEfx.alEffectf(arg0, arg1, arg2);
    }

    public static void alFilterf(int arg0, int arg1, float arg2) {
        org.lwjgl.openal.EXTEfx.alFilterf(arg0, arg1, arg2);
    }
}
