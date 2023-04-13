public class Rectangle {
    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int calculerSurface() {
        return longueur * largeur;
    }

    public void afficher() {
        for(int i = 0; i < largeur; i++) {
            for(int j = 0; j < longueur; j++) {
                System.out.print("##");
            }
            System.out.println();
        }
    }
}


