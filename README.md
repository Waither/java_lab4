Hibernate: 
    insert 
    into
        triangles
        (a, b, c, name) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        circles
        (name, radius) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        rectangles
        (height, name, width) 
    values
        (?, ?, ?)
Pobrane figury:
Hibernate: 
    select
        t1_0.id,
        t1_0.a,
        t1_0.b,
        t1_0.c,
        t1_0.name 
    from
        triangles t1_0 
    where
        t1_0.id=?
Hibernate: 
    select
        c1_0.id,
        c1_0.name,
        c1_0.radius 
    from
        circles c1_0 
    where
        c1_0.id=?
Hibernate: 
    select
        r1_0.id,
        r1_0.height,
        r1_0.name,
        r1_0.width 
    from
        rectangles r1_0 
    where
        r1_0.id=?
Triangle
Circle
Rectangle
Hibernate: 
    select
        t1_0.id,
        t1_0.a,
        t1_0.b,
        t1_0.c,
        t1_0.name 
    from
        triangles t1_0 
    where
        t1_0.id=?
Hibernate: 
    update
        triangles 
    set
        a=?,
        b=?,
        c=?,
        name=? 
    where
        id=?
Hibernate: 
    select
        c1_0.id,
        c1_0.name,
        c1_0.radius 
    from
        circles c1_0 
    where
        c1_0.id=?
Hibernate: 
    update
        circles 
    set
        name=?,
        radius=? 
    where
        id=?
Hibernate: 
    select
        r1_0.id,
        r1_0.height,
        r1_0.name,
        r1_0.width 
    from
        rectangles r1_0 
    where
        r1_0.id=?
Hibernate: 
    update
        rectangles 
    set
        height=?,
        name=?,
        width=? 
    where
        id=?

Po aktualizacji:
Hibernate: 
    select
        t1_0.id,
        t1_0.a,
        t1_0.b,
        t1_0.c,
        t1_0.name 
    from
        triangles t1_0 
    where
        t1_0.id=?
Hibernate: 
    select
        c1_0.id,
        c1_0.name,
        c1_0.radius 
    from
        circles c1_0 
    where
        c1_0.id=?
Hibernate: 
    select
        r1_0.id,
        r1_0.height,
        r1_0.name,
        r1_0.width 
    from
        rectangles r1_0 
    where
        r1_0.id=?
Updated Triangle, area: 21.394438383608005, perimeter: 26.9
Updated Circle, area: 283.5287369864788, perimeter: 59.690260418206066
Updated Rectangle, area: 60.0, perimeter: 32.0

Usuwanie figur...
Hibernate: 
    delete 
    from
        triangles 
    where
        id=?
Hibernate: 
    delete 
    from
        circles 
    where
        id=?
Hibernate: 
    delete 
    from
        rectangles 
    where
        id=?

Potwierdzenie usunięcia:
Hibernate: 
    select
        t1_0.id,
        t1_0.a,
        t1_0.b,
        t1_0.c,
        t1_0.name 
    from
        triangles t1_0 
    where
        t1_0.id=?
Hibernate: 
    select
        c1_0.id,
        c1_0.name,
        c1_0.radius 
    from
        circles c1_0 
    where
        c1_0.id=?
Hibernate: 
    select
        r1_0.id,
        r1_0.height,
        r1_0.name,
        r1_0.width 
    from
        rectangles r1_0 
    where
        r1_0.id=?
Triangle został usunięty.
Circle został usunięty.
Rectangle został usunięty.

Process finished with exit code 0




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
                <td class="bar">31 of 508</td>
                <td class="ctr2">93%</td>
                <td class="bar">13 of 20</td>
                <td class="ctr2">35%</td>
                <td class="ctr1">11</td>
                <td class="ctr2">51</td>
                <td class="ctr1">7</td>
                <td class="ctr2">147</td>
                <td class="ctr1">1</td>
                <td class="ctr2">41</td>
                <td class="ctr1">0</td>
                <td class="ctr2">6</td>
            </tr>
        </tfoot>
        <tbody>
            <tr>
                <td id="a0"><a href="com.lab4/index.html" class="el_package">com.lab5</a></td>
                <td class="bar" id="b0">31 of 508</td>
                <td class="ctr2" id="c0">93%</td>
                <td class="bar" id="d0">13 of 20</td>
                <td class="ctr2" id="e0">35%</td>
                <td class="ctr1" id="f0">11</td>
                <td class="ctr2" id="g0">51</td>
                <td class="ctr1" id="h0">7</td>
                <td class="ctr2" id="i0">147</td>
                <td class="ctr1" id="j0">1</td>
                <td class="ctr2" id="k0">41</td>
                <td class="ctr1" id="l0">0</td>
                <td class="ctr2" id="m0">6</td></tr>
            </tr>
        </tbody>
    </table>
    <div class="footer">
        Created with <a href="http://www.jacoco.org/jacoco">JaCoCo</a> 0.8.10.202304240956
    </div>
</body>
</html>
