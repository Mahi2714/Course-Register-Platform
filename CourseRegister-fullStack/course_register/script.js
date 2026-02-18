function showCourse(){
    fetch("http://localhost:8080/Courses").
    then(response=>response.json()).
    then(course=> {
        const table=document.getElementById("CourseTable");
        course.forEach(Courses => {
            var row=`
            <tr>
                <td>${Courses.CourseId}</td>
                <td>${Courses.CourseName}</td>
                <td>${Courses.DurationMonth}</td>
                <td>${Courses.Trainer}</td>
            </tr>
            `;
            table.innerHTML+=row;

            
        });
    }

    )
}

function showStudents(){
        fetch("http://localhost:8080/Courses/RegisteredStudents").
    then(response=>response.json()).
    then(course=> {
        const table=document.getElementById("RegisteredTable");
        course.forEach(Courses => {
            var row=`
            <tr>
                <td>${Courses.CourseName}</td>
                <td>${Courses.email}</td>
                <td>${Courses.name}</td>
            </tr>
            `;
            table.innerHTML+=row;

            
        });
    }
    )


}
