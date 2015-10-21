package center.rodrigo.main;

import center.rodrigo.core.LoadProperties;

public class Main {

    public static void main(String[] args) {

        LoadProperties lp = new LoadProperties();
        lp.load();
        
        lp.useProperties();

    }
}
