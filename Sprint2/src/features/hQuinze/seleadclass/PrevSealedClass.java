package features.hQuinze.seleadclass;


// As Classes seladas são uma classe que cria um modelo, que apenas
// as classes permitidas podem ser extendias
public abstract sealed class PrevSealedClass
        permits Circle, Rectangle, Square {



}
