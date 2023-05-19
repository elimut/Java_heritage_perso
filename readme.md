# Java exercice

## Héritage

Ici nous créons deux classes: Pirate et HommePoisson, ces classes sont sensiblement les mêmes.
De ce fait, nous allons créer une classe mère, afin de ne pas répéter le code.

L'on va faire hériter HommePoisson de Pirate et instancier deux personnages dans App.java.


PS C:\Users\orion\Desktop\github\Java_heritage_perso> javac com/perso/*.java

protected permet d'être private sauf pour la classe qui hérite
super pour les attributs, méthodes de la classe supérieure

on ne peut pas faire de multi héritage, exemple un pirat qui vole ne peut pas hériter de pirate car il y a déjà HommePoisson => polymorphisme, interface...

super en cas de redéfinition, this contexte sinon rien.

pour éviter qu'une classe soit étendue => **final**

    public final class Phenix extends HommePoisson {

    private int posZ;

    public  Phenix(String name) {
        super(name);
    }

final vaut pour les constantes, pour des méthodes.

## Classe abstraite

Une classe n'est pas forcèment concrète, on peut s'en faire une représentation. 
Certaines choses sont abstraites dans le monde réel et dans le code.
class abstraite avec des méthodes abstraites qui ne seraient pas instanciées, elle a au moins une méthode non instanciée (sans code particulier).
Elle n'est pas formellent différente d'une classe en java.
Elle permet de forcer l'extension ou la surcharge.
mot clef **abstract**.
Pas vraiement de sens à créer une classe => création classe abstraite. (différent de classe concrète).
Principe POO  qui dit que lors de la création de classes, et création d'objets nous devons identifier, seulement, les propriétés essentielles d'une entité et abandonner ce qui n'est pas pertinent.
C'est un espace vide, inachevé pour un groupe de classes futures, vide = brut, mais décrit certains états et comportements généraux des classes qui en héritent.
(Combattant.java et EtreViva,t)
C'est un plan.
Ne peuvent pas être instanciées.
Une classe est abstraite si au moins l'une de ses méthodes l'est, nous pouivpns implémenter toutes ses méthodes et n'en laisser aucune abstraite, classe abstraite sans méthodes abstraites mais il vaut mieux éviter.
Bonne manière de faire pour qu'une classe puisse avoir plsuieurs enfants.
Nous permet de définir plusieurs choses.
Methode abstraite qui ne va pas être implémentée => définir le code, l'instruction (juste nommée).
pas de getter ni setter dans une classe abstraite.s
Permet d'avoir un code solide.

Création dossier environnement pour création package,classes abstraites et classes filles:
voir schemaAbstract et dossier com.environnement


On peut étendre une classe native de Java.