package io.apptik.darksky.model;


import java.util.List;
import java.util.Map;

public interface DarkskyQuery {

    /**
     * exclude=[blocks] optional
     * <p>
     * Exclude some number of data blocks from the API response. This is useful for reducing latency and saving cache space. The value blocks should be a comma-delimeted list (without spaces) of any of the following:
     * <p>
     * currently
     * minutely
     * hourly
     * daily
     * alerts
     * flags
     *
     * @param blocks
     * @return
     */
    DarkskyQuery setExclude(List<Block> blocks);

    enum Block {
        CURRENTLY("currently"),
        MINUTELY("minutely"),
        HOURLY("hourly"),
        DAILY("daily"),
        ALERTS("alerts"),
        FLAGS("flags");
        String mValue;

        Block(String value) {
            mValue = value;
        }

        @Override
        public String toString() {
            return mValue;
        }
    }

    /**
     * extend=hourly optional
     * When present, return hour-by-hour data for the next 168 hours, instead of the next 48. When using this option, we strongly recommend enabling HTTP compression.
     *
     * @return
     */
    DarkskyQuery setExtend();

    /**
     * lang=[language] optional
     * <p>
     * Return summary properties in the desired language. (Note that units in the summary will be set according to the units parameter, so be sure to set both parameters appropriately.) language may be:
     * <p>
     * ar: Arabic
     * az: Azerbaijani
     * be: Belarusian
     * bs: Bosnian
     * ca: Catalan
     * cs: Czech
     * de: German
     * el: Greek
     * en: English (which is the default)
     * es: Spanish
     * et: Estonian
     * fr: French
     * hr: Croatian
     * hu: Hungarian
     * id: Indonesian
     * it: Italian
     * is: Icelandic
     * kw: Cornish
     * nb: Norwegian Bokmål
     * nl: Dutch
     * pl: Polish
     * pt: Portuguese
     * ru: Russian
     * sk: Slovak
     * sl: Slovenian
     * sr: Serbian
     * sv: Swedish
     * tet: Tetum
     * tr: Turkish
     * uk: Ukrainian
     * x-pig-latin: Igpay Atinlay
     * zh: simplified Chinese
     * zh-tw: traditional Chinese
     *
     * @return
     */
    DarkskyQuery setLang(Language language);

    enum Language {
        ARABIC("ar"),
        AZERBAIJANI("az"),
        BELARUSIAN("be"),
        BOSNIAN("bs"),
        CATALAN("ca"),
        CZECH("cs"),
        GERMAN("de"),
        GREEK("el"),
        ENGLISH("en"),
        SPANISH("es"),
        ESTONIAN("et"),
        FRENCH("fr"),
        CROATIAN("hr"),
        HUNGARIAN("hu"),
        INDONESIAN("id"),
        ITALIAN("it"),
        ICELANDIC("is"),
        CORNISH("kw"),
        NORWEGIAN_BOKMAL("nb"),
        DUTCH("nl"),
        POLISH("pl"),
        PORTUGUESE("pt"),
        RUSSIAN("ru"),
        SLOVAK("sk"),
        SLOVENIAN("sl"),
        SERBIAN("sr"),
        SWEDISH("sv"),
        TETUM("tet"),
        TURKISH("tr"),
        UKRAINIAN("uk"),
        PIG_LATIN("x-pig-latin"),
        SIMPLIFIED_CHINESE("zh"),
        TRADITIONAL_CHINESE("zh-tw");

        private String mValue;
        Language(String value) {
            mValue = value;
        }
        @Override
        public String toString() {
            return mValue;
        }
    }

    /**
     * units=[units] optional
     * <p>
     * Return weather conditions in the requested units. [units] should be one of the following:
     * <p>
     * auto: automatically select units based on geographic location
     * ca: same as si, except that windSpeed is in kilometers per hour
     * uk2: same as si, except that nearestStormDistance and visibility are in miles and windSpeed is in miles per hour
     * us: Imperial units (the default)
     * si: SI units
     * <p>
     * SI units are as follows:
     * <p>
     * summary: Any summaries containing temperature or snow accumulation units will have their values in degrees Celsius or in centimeters (respectively).
     * nearestStormDistance: Kilometers.
     * precipIntensity: Millimeters per hour.
     * precipIntensityMax: Millimeters per hour.
     * precipAccumulation: Centimeters.
     * temperature: Degrees Celsius.
     * temperatureMin: Degrees Celsius.
     * temperatureMax: Degrees Celsius.
     * apparentTemperature: Degrees Celsius.
     * dewPoint: Degrees Celsius.
     * windSpeed: Meters per second.
     * pressure: Hectopascals.
     * visibility: Kilometers.
     *
     * @return
     */
    DarkskyQuery setUnits(Units units);

    enum Units {
        AUTO("auto"),
        CA("ca"),
        UK("uk2"),
        US("us"),
        SI("si");
        private String mValue;
        Units(String value) {
            mValue = value;
        }
        @Override
        public String toString() {
            return mValue;
        }
    }

    Map<String,String> build();





}
