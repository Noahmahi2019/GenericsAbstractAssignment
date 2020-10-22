public class Main {

    public static void main(String[] args) {
            WindInstrument flute = new WindInstrument("flute");
            StringInstrument guitar = new StringInstrument("guitar");
            PercussionInstrument drum = new PercussionInstrument("drum");

            Department<WindInstrument, Integer> windInstrument = new Department<>("WindInstrument");
            windInstrument.addInstrument(flute, 001233);
            Department<StringInstrument, Integer> stringInstrument = new Department<>("StringInstrument");
            stringInstrument.addInstrument(guitar, 001010);
            Department<PercussionInstrument, Integer> percussionInstrument = new Department<>("PercussionInstrument");
            percussionInstrument.addInstrument(drum, 005050);

        }
    }
    