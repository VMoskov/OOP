class Utils {
    public static double getDirectorAverageRating(HashMap<String, MovieInfo> movies, String director) {
        double total = 0.;
        int count = 0;
        for (MovieInfo mi : movies.values()) {
            if (mi.getDirector() == director) {
                count += 1;
                total += mi.getAverageRating();
            }
        }

        return total / count;
    }

    public static String getHighestRatedByYear(HashMap<String, MovieInfo> movies, int year) {
        double best = 0.;
        String bestName = "";

        for (String name : movies.keySet()) {
            var mi = movies.get(name);
            if (mi.getYear() == year) {
                var rating = mi.getAverageRating();
                if (rating > best) {
                    best = rating;
                    bestName = name;
                }

            }
        }

        return bestName;
    }
    public static void addNewMovie(String name, MovieInfo movieInfo, HashMap<String, MovieInfo> movies) {
        movies.put(name, movieInfo);
    }

    public static void changeRating(String name, Rating ratingSite, int newRating, HashMap<String, MovieInfo> movies) {
        var mi = movies.get(name);
        if (ratingSite == Rating.IMDB) {
            mi.setIMDBRating(newRating);
        } else {
            mi.setRottenTomatoesRating(newRating);
        }

        mi.setAverageRating((mi.getIMDBRating() + mi.getRottenTomatoesRating()) / 2);
    }

    public static double getAverageMovieRating(String name, HashMap<String, MovieInfo> movies) {
        return movies.get(name).getAverageRating();
    }

    public static void removeMovieMadeBefore(HashMap<String, MovieInfo> movies, int year) {

        for (Iterator<String> iterator = movies.keySet().iterator(); iterator.hasNext();) {
            String mName = iterator.next();
            var mi = movies.get(mName);
            if (mi.getYear() < year) {
                iterator.remove();
            }
        }

    }
}