/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Televisor {
Integer canal =new Integer(130);
Integer volume =new Integer (20);
void mudarCanal(Integer novoCanal) {
if (canal.equals(novoCanal)) {
System.out.println("Novo canal é também o canal atual.");
} else {
canal = novoCanal;
System.out.println("Canal alterado para " + canal);
}
}
void mudarVolume(Integer novoVolume) {
if (novoVolume.equals(volume)) {
System.out.println("Novo volume é também o volume atual.");
} else {
volume = new Integer(novoVolume.byteValue());
System.out.println("Volume alterado para " + volume);
}
}
}
public class Main
{
	public static void main(String[] args) {
		Televisor tv = new Televisor();
// Não deveria mudar o volume e canal
tv.mudarVolume(20);
tv.mudarCanal(130);
// Deveria mudar o volume e canal
tv.mudarVolume(300);
tv.mudarCanal(10);
	
}
}
