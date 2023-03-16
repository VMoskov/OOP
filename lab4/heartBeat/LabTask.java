class LabTask {
    public static Integer heartBeatAvg(String device, LocalDate day, Map<String,Map<LocalDate,List<Zapis>>> data) {
        float average = 0;
        int count = 0;
        for (var entry : data.entrySet()){  //entry je dataset
            for (var entryLowerLevel : entry.getValue().entrySet()){    //entryLowerLevel je map u mapi
                if (entryLowerLevel.getKey().equals(day)){
                    List<Zapis> list = entryLowerLevel.getValue();
                    for (var zapis : list){
                        average += zapis.getBeats();
                        count++;
                    }
                }
            }
        }

        return (int)average / count;
    }

    public static Zapis heartBeatMax(String device, LocalDate day, Map<String,Map<LocalDate,List<Zapis>>> data) {
        Zapis returnZapis = null;
        for (var entry : data.entrySet()){  //entry je dataset
            for (var entryLowerLevel : entry.getValue().entrySet()){    //entryLowerLevel je map u mapi
                if (entryLowerLevel.getKey().equals(day)){
                    List<Zapis> list = entryLowerLevel.getValue();
                    for (var zapis : list){
                        if (returnZapis == null)
                            returnZapis = zapis;
                        else {
                            if (zapis.getBeats() > returnZapis.getBeats())
                                returnZapis = zapis;
                        }
                    }
                }
            }
        }

        return returnZapis;
    }

    public static Zapis heartBeatMin(String device, LocalDate day, Map<String,Map<LocalDate,List<Zapis>>> data) {
        Zapis returnZapis = null;
        for (var entry : data.entrySet()){  //entry je dataset
            for (var entryLowerLevel : entry.getValue().entrySet()){    //entryLowerLevel je map u mapi
                if (entryLowerLevel.getKey().equals(day)){
                    List<Zapis> list = entryLowerLevel.getValue();
                    for (var zapis : list){
                        if (returnZapis == null)
                            returnZapis = zapis;
                        else {
                            if (zapis.getBeats() < returnZapis.getBeats())
                                returnZapis = zapis;
                        }
                    }
                }
            }
        }

        return returnZapis;
    }
}