/*
 * Copyright (c) 2014. PathOS Variant Curation System. All rights reserved.
 *
 * Organisation: Peter MacCallum Cancer Centre
 * Author: doig ken
 */



dataSource
        {
            pooled = true
        }

hibernate
        {
            cache.use_second_level_cache = true
            cache.use_query_cache = false
            cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
        }

//  Application properties
//
def loc  = Locator.instance

// environment specific settings
//
environments
        {

            development {

                dataSource
                        {
                            dialect  = "org.hibernate.dialect.MySQL5InnoDBDialect"
                            dbCreate = "create-drop"

                            //  MySql parameters for DB
                            //
                            driverClassName = "com.mysql.jdbc.Driver"
                            username = 'root'
                            password = ''
                            dbschema = 'gt'
                            dbhost   = 'localhost'
                            url = "jdbc:mysql://localhost:3306/gt?autoreconnect=true?useUnicode=yes&characterEncoding=UTF-8"
                        }
            }

            test {
                dataSource
                        {
                            dialect  = "org.hibernate.dialect.MySQL5InnoDBDialect"
                            dbCreate = "create-drop"

                            //  MySql parameters for DB
                            //
                            driverClassName = "com.mysql.jdbc.Driver"
                            username = 'bioinformatics'
                            password = ''
                            dbschema = 'gt'
                            dbhost   = 'bioinf-pathos-test.petermac.org.au'
                            url = "jdbc:mysql://bioinf-pathos-test.petermac.org.au:3306/gt?autoreconnect=true?useUnicode=yes&characterEncoding=UTF-8"
                        }
            }
        }