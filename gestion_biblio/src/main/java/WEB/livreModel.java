package WEB;

import java.util.ArrayList;
import java.util.List;
import Metier.livre;

public class livreModel {
private String mc;
private List<livre> livres = new ArrayList<livre>(); 

public String getMc() {
	return mc;
}
public void setMc(String mc) {
	this.mc=mc;
}

public List<livre> getLivre(){
	return livres;
}

public void setLivres(List<livre> livres) {
	this.livres=livres;
}
}
 