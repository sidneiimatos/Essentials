package io.github.sidneiimatos.essentials.configmanager;

import io.github.sidneiimatos.essentials.Essentials;

import java.util.Arrays;
import java.util.List;

public class Config {
    public static final String NO_PERMISSION = Essentials.getInstance().getConfig().getString("NO_PERMISSION").replace("&","§");
    public static final String CONSOLE_BLOCKED = Essentials.getInstance().getConfig().getString("CONSOLE_BLOCKED").replace("&","§");
    public static final String HEAL = Essentials.getInstance().getConfig().getString("HEAL").replace("&", "§");
    public static final String FLY_ATIVADO = Essentials.getInstance().getConfig().getString("FLY.ATIVADO").replace("&","§");
    public static final String FLY_DESATIVADO = Essentials.getInstance().getConfig().getString("FLY.DESATIVADO").replace("&","§");
    public static final List<String> INFORMATIONS_SITE = Essentials.getInstance().getConfig().getStringList("SITE");
    public static final List<String> INFORMATIONS_YOUTUBER = Essentials.getInstance().getConfig().getStringList("YOUTUBE");

    //public final static String NO_PERMISSION_VIP = "Você não tem permissão para utilizar este comando! /n Adquira VIP";
}
