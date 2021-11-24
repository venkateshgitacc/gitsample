package org.emp;

public class StateDetails {
public void southIndia() {
System.out.println(" south India");
}
public void northIndia() {
System.out.println("North India");
}
public static void main(String[] args) {
StateDetails s= new StateDetails();
LanguageInfo l= new LanguageInfo();
s.southIndia();
s.northIndia();
l.tamilLanguage();
l.englishLanguage();
l.hindiLanguage();
}
}
