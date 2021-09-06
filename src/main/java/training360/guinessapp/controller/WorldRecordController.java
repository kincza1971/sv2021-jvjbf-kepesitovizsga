package training360.guinessapp.controller;

import org.springframework.web.bind.annotation.*;
import training360.guinessapp.dto.BeatWorldRecordCommand;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.dto.WorldRecordDto;
import training360.guinessapp.service.WorldRecordService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/worldrecords")
public class WorldRecordController {

    private WorldRecordService service;

    public WorldRecordController(WorldRecordService service) {
        this.service = service;
    }

    @PostMapping
    public WorldRecordDto saveWordRecord(@RequestBody @Valid WorldRecordCreateCommand command) {
        return service.SaveWorldRecord(command);
    }

    @PutMapping("/{id}/beatrecords")
    public WorldRecordDto beatRecord(@PathVariable long id, @RequestBody @Valid BeatWorldRecordCommand command) {
        return service.saveNewRecord(id, command);
    }

}

//PUT /api/worldrecords/{id}/beatrecords
//A kérés hatására a következő adatok érkeznek:
//
//URL-ben: világrekord id (Long)
//JSON-ben:
//
//új rekorder id-ja (Long, nem lehet null)
//új rekord értéke (Double, nem lehet null)
//A kérésben beérkező adatokat a fenti feltételek alapján validáld le, és hiba esetén küldj vissza hibaüzenet (a pontos hibaüzeneteket megtalálhatod a vonatkozó teszteseteknél), valamint 400-as hibakódot!
//
//Amennyiben...
//
//a megadott id-nak megfelelő rekorder nem található a rendszerben,
//vagy a megadott id-nak megfelelő világrekord nem található a rendszerben,
//vagy az új rekord értéke kisebb, mint a megtalált rekord eredeti értéke,
//... akkor küldj vissza ugyanúgy 400-as hibakódot és hibaüzenetet! Ezekhez használhatod a validációs hibák formátumait, a pontos hibaüzeneteket megtalálhatod a megfelelő teszteseteknél.
//
//Ha minden validáció, és ellenőzés sikeres volt, a világrekodon állíts be az új rekordert, az új rekord értékét, és az aktuális dátumot!
//
//Sikeres módosítás esetén az alkalmazás küldjön vissza egy 200-es státuszkódot, valamint a következő adatokat:
//
//rekord leírása
//mértékegység
//korábbi rekorder neve
//korábbi rekord értéke
//új rekorder neve
//új rekord értéke
//két rekord különbsége
//A megfelelő tesztesetben megtalálod a szükséges elnevezéseket.
//
//Részpontok
//A beérkező HTTP kérést az alkalmazás kezeli - 3 pont
//Egyszerű mezők validálása és hibakezelése - 2 pont
//Nem létező rekorder hibájának kezelése - 2 pont
//Nem létező világrekord hibájának kezelése - 2 pont
//Új rekord értékének ellenőrzése - 2 pont
//A megfelelő módosítások megtörténnek - 4 pont
//A válasz tartalmazza a megfelelő adatokat - 3 pont
//Teszteset: WorldRecordBeatIT
