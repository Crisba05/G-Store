package gclass;

import gFrame.*;
public class ventanas {
    MainLogin login = new MainLogin();
    Register register = new Register();
    mainStore main = new mainStore();
    dataProd prod = new dataProd();
    addCard card = new addCard();
    
    
    public void Vlogin(){
        login.setVisible(true);
    }
    
    public void Vregister(){
        register.setVisible(true);
    }
    public void Vmain(){
        main.setVisible(true);
    }
    public void Vprod(){
        prod.setVisible(true);
    }
    public void Vcard(){
        card.setVisible(true);
    }
}
