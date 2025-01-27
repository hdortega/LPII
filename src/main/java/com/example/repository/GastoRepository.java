package com.example.repository;

import com.example.model.Gasto;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class GastoRepository {

    private static final String DATA_FILE = "src/main/resources/data.json";
    private static List<Gasto> gastos = loadData();

    private static List<Gasto> loadData() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return Arrays.asList(objectMapper.readValue(new File(DATA_FILE), Gasto[].class));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private static void saveData() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(DATA_FILE), gastos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Gasto> getAllGastos() {
        return gastos;
    }

    public Gasto getGastoById(int id) {
        return gastos.stream().filter(gasto -> gasto.getId() == id).findFirst().orElse(null);
    }

    public void addGasto(Gasto gasto) {
        gastos.add(gasto);
        saveData();
    }

    public void updateGasto(int id, Gasto gasto) {
        for (int i = 0; i < gastos.size(); i++) {
            if (gastos.get(i).getId() == id) {
                gastos.set(i, gasto);
                saveData();
                break;
            }
        }
    }

    public void deleteGasto(int id) {
        gastos.removeIf(gasto -> gasto.getId() == id);
        saveData();
    }

    public double getPromedioGastos() {
        return gastos.stream().mapToDouble(Gasto::getMonto).average().orElse(0.0);
    }

    public List<Gasto> getGastosPorRangoFecha(long inicio, long fin) {
        return gastos.stream()
                .filter(gasto -> gasto.getFecha() >= inicio && gasto.getFecha() <= fin)
                .collect(Collectors.toList());
    }
}
