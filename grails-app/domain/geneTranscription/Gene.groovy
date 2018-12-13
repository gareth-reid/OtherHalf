package geneTranscription

import grails.persistence.Entity

@Entity
public class Gene
{
    String geneCode
    static constraints =
            {
                geneCode(nullable: true)
            }
}


