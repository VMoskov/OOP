public static Map<Integer, String> teamRankingCalculation(Map<Integer, Map<Integer, Integer>> standings){
        TreeMap<Integer, String> van = new TreeMap<>();
        TreeMap<Integer, Integer> bodovi = new TreeMap<>();  // id vozaca, broj bodova
        LinkedHashMap<String, Integer> tim = new LinkedHashMap<>(); // id tima, broj bodova

        for(Integer i: standings.keySet()){
        int sum=0;
        for(Integer p: standings.get(i).keySet()){
        sum+=standings.get(i).get(p);
        }
        bodovi.put(i,sum);
        }

        for(Integer k: bodovi.keySet()){
        int timm=driverTeamIdentification.get(k);
        int bodd = tim.getOrDefault(teams.get(timm), (int)0);
        tim.put(teams.get(timm), bodd+bodovi.get(k));
        }
        for(String s: tim.keySet()){
        van.put(tim.get(s),s);
        }

        return van;
        }