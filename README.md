Hibernate: 
    select
        s1_0.id,
        s1_0.area,
        s1_0.name 
    from
        shapes s1_0 
    where
        s1_0.id=?
Hibernate: 
    insert 
    into
        shapes
        (area, name) 
    values
        (?, ?)
Zapisano ksztalt: Circle o powierzchni: 12.56

Hibernate: 
    select
        s1_0.id,
        s1_0.area,
        s1_0.name 
    from
        shapes s1_0 
    where
        s1_0.id=?
Pobrano ksztalt: Circle o powierzchni: 12.56

Hibernate: 
    update
        shapes 
    set
        area=?,
        name=? 
    where
        id=?
Zaktualizowano ksztalt: Updated Circle o powierzchni: 15.75

Hibernate: 
    select
        s1_0.id,
        s1_0.area,
        s1_0.name 
    from
        shapes s1_0 
    where
        s1_0.id=?
Zaktualizowany ksztalt (z bazy): Updated Circle o powierzchni: 15.75

Hibernate: 
    delete 
    from
        shapes 
    where
        id=?
Ksztalt o ID 1 został pomyślnie usunięty.

Hibernate: 
    select
        s1_0.id,
        s1_0.area,
        s1_0.name 
    from
        shapes s1_0 
    where
        s1_0.id=?
Ksztalt o ID 1 został pomyślnie usunięty z bazy danych.



<!DOCTYPE html>
<html lang="pl">
<body>
    <h1>Raport Pokrycia Testami - lab3</h1>
    <table>
        <thead>
            <tr>
                <th>Element</th>
                <th>Missed Instructions</th>
                <th class="ctr2">Cov. Instructions</th>
                <th>Missed Branches</th>
                <th class="ctr2">Cov. Branches</th>
                <th class="ctr1">Missed Cxty</th>
                <th class="ctr2">Cxty</th>
                <th class="ctr1">Missed Lines</th>
                <th class="ctr2">Lines</th>
                <th class="ctr1">Missed Methods</th>
                <th class="ctr2">Methods</th>
                <th class="ctr1">Missed Classes</th>
                <th class="ctr2">Classes</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <td>Total</td>
                <td class="bar">26 of 245</td>
                <td class="ctr2">89%</td>
                <td class="bar">10 of 18</td>
                <td class="ctr2">44%</td>
                <td class="ctr1">9</td>
                <td class="ctr2">24</td>
                <td class="ctr1">14</td>
                <td class="ctr2">79</td>
                <td class="ctr1">1</td>
                <td class="ctr2">15</td>
                <td class="ctr1">0</td>
                <td class="ctr2">3</td>
            </tr>
        </tfoot>
        <tbody>
            <tr>
                <td id="a0">
                    <a href="com.lab4/index.html" class="el_package">com.lab4</a>
                </td>
                <td class="bar" id="b0">
                    <img src="jacoco-resources/redbar.gif" width="12" height="10" title="26" alt="26"/>
                    <img src="jacoco-resources/greenbar.gif" width="107" height="10" title="219" alt="219"/>
                </td>
                <td class="ctr2" id="c0">89%</td>
                <td class="bar" id="d0">
                    <img src="jacoco-resources/redbar.gif" width="66" height="10" title="10" alt="10"/>
                    <img src="jacoco-resources/greenbar.gif" width="53" height="10" title="8" alt="8"/>
                </td>
                <td class="ctr2" id="e0">44%</td>
                <td class="ctr1" id="f0">9</td>
                <td class="ctr2" id="g0">24</td>
                <td class="ctr1" id="h0">14</td>
                <td class="ctr2" id="i0">79</td>
                <td class="ctr1" id="j0">1</td>
                <td class="ctr2" id="k0">15</td>
                <td class="ctr1" id="l0">0</td>
                <td class="ctr2" id="m0">3</td>
            </tr>
        </tbody>
    </table>
    <div class="footer">
        Created with <a href="http://www.jacoco.org/jacoco">JaCoCo</a> 0.8.10.202304240956
    </div>
</body>
</html>
