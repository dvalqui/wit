package com.example.Women_in_tech.components;

import com.example.Women_in_tech.models.Publication;
import com.example.Women_in_tech.models.Woman;
import com.example.Women_in_tech.repositories.PublicationRepository;
import com.example.Women_in_tech.repositories.WomanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    WomanRepository womanRepository;
    @Autowired
    PublicationRepository publicationRepository;


    public void run(ApplicationArguments args) {
        Woman ada = new Woman("Ada Lovelace", "10 December 1815 – 27 November 1852",
                "Ada Lovelace was a 19th century English mathematician and writer. She is best known for her work on Charles Babbage's proposed mechanical general-purpose computer, the Analytical Engine.", "no agency");
        womanRepository.save(ada);

        Woman evelyn = new Woman("Dr. Evelyn Boyd Granville", "1 May 1924", "Dr. Evelyn Boyd Granville is the second Black Woman to earn a PhD in Mathematics in the United States. She contributed to computer programming and mathematics for NASA's Apollo missions.", "NASA");
        womanRepository.save(evelyn);

        Woman hedy = new Woman("Hedy Lamarr", "9 November 1914 - 19 January 2000", "Hedy Lamarr was an Austrian-born American film actress and inventor. She is credited with pioneering technology that is used today for bluetooth devices.", "no agency");
        womanRepository.save(hedy);

        Publication numbers = new Publication("Ada, the Enchantress of Numbers: A Selection from the Letters of Lord Byron's Daughter and Her Description of the First Computer ", ada, 1993, "computer science", "www.ada.com");
        publicationRepository.save(numbers);

        Publication computer = new Publication("Sketch of the analytical engine invented by Charles Babbage, Esq", ada, 1843, "computer science", "https://repository.ou.edu/uuid/6235e086-c11a-56f6-b50d-1b1f5aaa3f5e#page/1/mode/2up");
        publicationRepository.save(computer);

        Publication papers = new Publication("The Evelyn Boyd Granville Papers", evelyn, 2010, "computer science, engineering", "https://findingaids.smith.edu/repositories/2/resources/1213");
        publicationRepository.save(papers);

        Publication myLife = new Publication("My Life as a Mathematician", evelyn, 1989, "mathematics, computer science", "https://mathwomen.agnesscott.org/women/granvill.htm");
        publicationRepository.save(myLife);

        Publication looking = new Publication("Looking Back...Looking Ahead", evelyn, 2005, "mathematics", "https://press.princeton.edu/books/paperback/9780691171098/complexities");
        publicationRepository.save(looking);

        Publication secret = new Publication("Secret Communication System", hedy, 1941, "wireless technology", "https://airandspace.si.edu/multimedia-gallery/4790640jpg");
        publicationRepository.save(secret);

    }


}

