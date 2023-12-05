package io.github.sidneiimatos.essentials.configmanager;

import io.github.sidneiimatos.essentials.Essentials;

public class Config {
    public final static String NO_PERMISSION = Essentials.getInstance().getConfig().getString("NO_PERMISSION").replace("&","§");
    public final static String CONSOLE_BLOCKED = Essentials.getInstance().getConfig().getString("CONSOLE_BLOCKED").replace("&","§");
    public final static String FLY_ATIVADO = Essentials.getInstance().getConfig().getString("FLY.ATIVADO").replace("&","§");
    public final static String FLY_DESATIVADO = Essentials.getInstance().getConfig().getString("FLY.DESATIVADO").replace("&","§");

    //public final static String NO_PERMISSION_VIP = "Você não tem permissão para utilizar este comando! /n Adquira VIP";
}
