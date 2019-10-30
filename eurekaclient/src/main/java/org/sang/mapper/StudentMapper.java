package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.pojo.Student;

import java.util.List;
@Mapper
public interface StudentMapper {
    public List<Student> Students();
    public Integer Add(Student student);
    public Integer Update(Student student);
    public Integer Delete(Integer sid);
}
