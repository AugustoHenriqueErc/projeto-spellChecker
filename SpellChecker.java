
/**
 * Escreva uma descrição da classe SpellChecker aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.ArrayList;
public class SpellChecker
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList dicionário;
    private int numberOfWords;
    /**
     * Construtor para objetos da classe SpellChecker
     */
    public SpellChecker(String filename)
    {
        DictReader words = new DictReader(filename);
        dicionário = words.getDictionary();
    }
    
    public int numberOfWords()
    {
        numberOfWords = dicionário.size();
        return numberOfWords;
    }
    
    public boolean isKnownWord(String word)
    {
        if(dicionário.contains(word))
        {
            return true;
        }
            return false;
    }
    
    public boolean allKnownWords(ArrayList<String> words)
    {
        for(String word: words)
        {
            if(dicionário.contains(word))
            {
                
            }
        }
        return true;
    }
}
