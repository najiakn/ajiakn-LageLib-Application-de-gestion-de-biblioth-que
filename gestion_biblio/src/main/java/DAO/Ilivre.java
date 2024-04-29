package DAO;
import Metier.livre;
import java.util.List;
public interface Ilivre {
	public livre ajouter(livre L);
    public List<livre> chercher(String mc);
    public livre lister(int id);
    public livre modifier(livre L);
    public void supprimer(int id);
    
}
