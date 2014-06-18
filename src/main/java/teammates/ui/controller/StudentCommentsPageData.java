package teammates.ui.controller;

import java.util.List;
import java.util.Map;

import teammates.common.datatransfer.AccountAttributes;
import teammates.common.datatransfer.CommentAttributes;
import teammates.common.datatransfer.CourseRoster;
import teammates.common.util.Const;

public class StudentCommentsPageData extends PageData {

    public String courseId;
    public String courseName;
    public List<String> coursePaginationList;
    public Map<String, List<CommentAttributes>> comments;
    public CourseRoster roster;
    public String previousPageLink;
    public String nextPageLink;
    
    public StudentCommentsPageData(AccountAttributes account) {
        super(account);
        // TODO Auto-generated constructor stub
    }

    public String getStudentCommentsLink(){
        String link = Const.ActionURIs.STUDENT_COMMENTS_PAGE;
        link = addUserIdToUrl(link);
        return link;
    }
}
