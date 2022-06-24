package main.java.Main1;

import main.java.ConfigFile.ConfigAuto;
import main.java.Login.LoginAuto;
import main.java.Login2FA.TwoFactorAuthAuto;

public class MainClass2 {

    public static void main(String[] args){

        LoginAuto login = new LoginAuto();
        login.loginA();

        TwoFactorAuthAuto tfa = new TwoFactorAuthAuto();
        tfa.TwofactAuth();


    }
}
