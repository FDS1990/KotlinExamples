public class anagrafica
{

  private String nome;
  private String cognome;
  
  private int eta;
  private String codice_fiscale;


public anagrafica(String c_nome,String c_cognome,int c_eta,String c_codice_fiscale)
{

  this.nome=c_nome;
  this.cognome=c_cognome;
  
  this.eta=c_eta;
  this.codice_fiscale=c_codice_fiscale

}

public void Setnome(String nuovo_nome)
{
  this.nome=nuovo_nome;
}

public String Getnome()
{
  return this.nome;
}

public void Setcognome(String nuovo_cognome)
{
  this.cognome=nuovo_cognome;
}

public String Getcognome()
{
  return this.cognome;
}

public void setEta(int nuova_eta)
{
  this.eta=nuova_eta;
}

public int getEta()
{
  return this.eta;
}
 
 public void Setcodice_fiscale(String nuovo_codice)
 {
  this.codice_fiscale=nuovo_codice;
 }
 
 public String Getcodice_fiscale()
 {
  return this.codice_fiscale;
 }
 

}
