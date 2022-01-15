package model;

import restClient.dto.HotelDto;

import javax.swing.table.DefaultTableModel;

public class HotelModel extends DefaultTableModel {
    public HotelModel() throws IllegalAccessException, NoSuchMethodException{
        super(new String[]{"Name", "Description"}, 0);

    }
    private HotelDto hotelDto = new HotelDto();
    @Override
    public void addRow(Object[] row) {
        super.addRow(row);
        HotelDto dto = new HotelDto();
        dto.setName(String.valueOf(row[0]));
        dto.setDescription(String.valueOf(row[1]));
    }
}
