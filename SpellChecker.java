
/**
 * Escreva uma descrição da classe SpellChecker aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.ArrayList;
import java.util.Iterator;

public class SpellChecker
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<String> dicionário;
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
            if(!dicionário.contains(word))
            {
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<String> wordsStartsWith(String prefix)
    {
        ArrayList<String> wordsStartsWith = new ArrayList<>();  
        for(String word: dicionário)
        {
           if(word.startsWith(prefix))
            {
                wordsStartsWith.add(word);
            }
        }
        return wordsStartsWith;
    }
    
    public ArrayList<String> wordsContaining(String text)
    {
        ArrayList<String> wordsContaining = new ArrayList<>();  
        for(String word: dicionário)
        {
           if(word.contains(text))
            {
                wordsContaining.add(word);
            }
        }
        return wordsContaining;
    }
    
    public void insert(String newWord)
    {
        if(!this.isKnownWord(newWord))
        {
            for(int i = 0; i < dicionário.size();i++)
            {
                 if(newWord.compareTo(dicionário.get(i)) > 0)
                {
                      dicionário.add(newWord);  
                }
            }
        }
    }
    
    public void remove(String removeWord)
    {
        Iterator<String> it = dicionário.iterator();
        String search;
        if(this.isKnownWord(removeWord))
        {
            while(it.hasNext())
            {
                search = it.next();
                if(removeWord == search) it.remove();
            }
        }
    }
    
    public boolean isPalindrome(String word)
    {
        if(this.isKnownWord(word))
        {
            word = word.toLowerCase();
            String pali = new StringBuilder(word).reverse().toString();
            if(word  == pali) return true;
        }
        return false;
    }
}   