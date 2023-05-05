package projetannexe14;

/*1. Dans ce projet, créez une nouvelle classe Route représentant une route à être construite. Les variables d'instance à utiliser sont les suivantes :

        •	une variable contenant le nombre de kilomètres que fera la route
        •	une variable contenant le nombre de ponts que contiendra la route à construire
        •	une variable contenant le nombre de passages fauniques installés dans cette route
        •	une variable représentant si les accotements de cette route seront asphaltés ou non ( boolean )
*/

public class Route {
    private double Kilometre;
    private double Nbpont;
    private double Passagefaunique;
    private boolean accotement;

    public Route(double kilometre,double nbpont, double passagefaunique, boolean accotement){
        this.accotement=accotement;
        this.Kilometre=kilometre;
        this.Nbpont=nbpont;
        this.Passagefaunique=passagefaunique;
    }

    public boolean getaccotemnet(){return accotement;}

    public double getKilometre(){return Kilometre;}

    public double getNbpont() {return Nbpont;}

    public double getPassagefaunique() {return Passagefaunique;}

    public double calculerCout(){
        double cout=0;

        cout+=(Kilometre*3.4);
        cout+=(cout*0.1);
        cout+=(Nbpont*6);
        cout+=(Passagefaunique*0.7);

        return cout;}
}
