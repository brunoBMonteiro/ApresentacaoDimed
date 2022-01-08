package features.dezesete.seleadclass;


// As Classes seladas são uma classe que cria um modelo, que apenas
// as classes permitidas podem ser extendias
public abstract sealed class ReleaseSealedClass
        permits Circle, Rectangle, Square {



}
