package io.apptik.darksky.modelImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.apptik.darksky.model.DarkskyQuery;



public class DarkskyQueryImpl implements DarkskyQuery {

    List<Block> blocks;
    boolean extend = false;
    Language language;
    Units units;

    @Override
    public DarkskyQuery setExclude(List<Block> blocks) {
        this.blocks = blocks;
        return this;
    }

    private String buildExclude() {
        StringBuilder sb = new StringBuilder();
        for(Block block:blocks) {
            sb.append(block).append(",");
        }

        return sb.toString();
    }

    @Override
    public DarkskyQuery setExtend() {
        extend = true;
        return this;
    }

    @Override
    public DarkskyQuery setLang(Language language) {
        this.language = language;
        return this;
    }

    @Override
    public DarkskyQuery setUnits(Units units) {
        this.units = units;
        return this;
    }

    @Override
    public Map<String, String> build() {
        Map<String,String> q = new HashMap<>(4);
        if (blocks!=null) q.put("exclude",buildExclude());
        if (extend) q.put("extend","hourly");
        if (language!=null) q.put("lang",language.toString());
        if (units!=null) q.put("units",units.toString());
        return q;
    }
}
