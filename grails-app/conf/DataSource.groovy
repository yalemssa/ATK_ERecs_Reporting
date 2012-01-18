dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "aTreadOnly"
    password = "m554"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = 'update'
            url = "jdbc:mysql://mssaserver04.library.yale.edu:3306/yale"
        }
    }
    test {
        dataSource {
            dbCreate = 'update'
            url = "jdbc:mysql://mssaserver04.library.yale.edu:3306/yale"
        }
    }
    
    production {
        dataSource {
            dbCreate = 'update'
            url = "jdbc:mysql://avideo.library.yale.edu:3306/yale"
        }
    }
}
