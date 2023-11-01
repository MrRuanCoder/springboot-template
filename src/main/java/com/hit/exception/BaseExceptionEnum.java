package com.hit.exception;

/**
 * Type Declare of BaseExceptionEnum (specific circumstances below are for reference only)
 *
 * @author Ruan
 * @create 2023-05-16 12:27:45
 */
public enum BaseExceptionEnum implements BaseExceptionType {
    /**
     * order type error
     */
    ORDER_TYPE_ERROR(14000, "Bad orderType"),
    /**
     * geCode not find!
     */
    GE_CODE_NOT_FOUND(14001, "geCode not find!"),
    /**
     * PrimaryEmail is existed!
     */
    PRIMARY_EMAIL_REPEATED(14002, "PrimaryEmail is existed!"),
    /**
     * Please check keywords
     */
    KEY_WORDS_ERROR(14003, "Please check keywords"),
    /**
     * some change happened to SI Publication Format, please try again
     */
    SI_PUBLICATION_FORMAT_ERROR(14004, "some change happened to SI Publication Format, please try again"),
    /**
     * some change happened to Paper Commissioning Method, please try again
     */
    PAPER_COMMISSIONING_METHOD_ERROR(14005, "some change happened to Paper Commissioning Method, please try again"),
    /**
     * Title length invalid!
     */
    TITLE_LENGTH_INVALID(14006, "Title length invalid!"),
    /**
     * Date order invalid!
     */
    DATE_ORDER_INVALID(14007, "Date order invalid!"),
    /**
     * Remark length invalid!
     */
    REMARK_LENGTH_INVALID(14008, "Remark length invalid!"),
    /**
     * invalid SI_SOURCE
     */
    SPECIAL_ISSUE_SOURCE_INVALID(14009, "invalid SI_SOURCE"),
    /**
     * invalid WORKFLOW
     */
    WORKFLOW_INVALID(14010, "invalid WORKFLOW"),
    /**
     * invalid CLOSED_FOR_SUBMISSION
     */
    CLOSED_FOR_SUBMISSION_INVALID(14011, "invalid CLOSED_FOR_SUBMISSION"),
    /**
     * FirstName is mandatory!
     */
    FIRST_NAME_REQUIRED(14012, "FirstName is mandatory!"),
    /**
     * lastName is mandatory!
     */
    LAST_NAME_REQUIRED(14013, "lastName is mandatory!"),
    /**
     * invalid ORCID_ID
     */
    ORCID_ID_INVALID(14014, "invalid ORCID_ID"),
    /**
     * PrimaryEmail is mandatory!
     */
    PRIMARY_EMAIL_REQUIRED(14015, "PrimaryEmail is mandatory!"),
    /**
     * invalid format of primaryEmail
     */
    PRIMARY_EMAIL_INVALID(14016, "invalid format of primaryEmail"),
    /**
     * invalid format of secondaryEmail
     */
    SECONDARY_EMAIL_INVALID(14017, "invalid format of secondaryEmail"),
    /**
     * SecondaryEmail can't be the same with primaryEmail
     */
    PRIMARY_EMAIL_SAME_WITH_SECONDARY_EMAIL(14018, "SecondaryEmail can't be the same with primaryEmail"),
    /**
     * invalid format of ResearchGateId
     */
    RESEARCH_GATE_ID_INVALID(14019, "invalid format of ResearchGateId"),
    /**
     * Institute is mandatory!
     */
    INSTITUTE_REQUIRED(14020, "Institute is mandatory!"),
    /**
     * invalid length of Institute
     */
    INSTITUTE_LENGTH_INVALID(14021, "invalid length of Institute"),
    /**
     * Country is mandatory!
     */
    COUNTRY_REQUIRED(14022, "Country is mandatory!"),
    /**
     * invalid format of ProfileWebsite
     */
    PROFILE_WEBSITE_INVALID(14023, "invalid format of ProfileWebsite"),
    /**
     * invalid length of Notes
     */
    NOTES_LENGTH_INVALID(14024, "invalid length of Notes"),
    /**
     * gender is mandatory
     */
    GENDER_REQUIRED(14025, "gender is mandatory"),
    /**
     * invalid gender type
     */
    GENDER_INVALID(14026, "invalid gender type"),
    /**
     * invalid title
     */
    TITLE_INVALID(14027, "invalid title"),
    /**
     * ResearchKeywords are mandatory!
     */
    RESEARCH_KEYWORDS_REQUIRED(14028, "ResearchKeywords are mandatory!"),
    /**
     * email format error
     */
    EMAIL_INVALID(14029, "email format error"),
    /**
     * the email address has been registered
     */
    EMAIL_OCCUPIED(14030, "the email address has been registered"),
    /**
     * the Guest Editor's first name should less than 40
     */
    GUEST_EDITOR_FIRST_NAME_LENGTH_INVALID(14031, "the Guest Editor's first name should less than 40"),
    /**
     * the Guest Editor's last name should less than 40
     */
    GUEST_EDITOR_LAST_NAME_LENGTH_INVALID(14032, "the Guest Editor's last name should less than 40"),
    /**
     * the Guest Editor's primary email should less than 100
     */
    GUEST_EDITOR_PRIMARY_EMAIL_LENGTH_INVALID(14033, "the Guest Editor's primary email should less than 100"),
    /**
     * create guest editor fail
     */
    CREATE_GUEST_EDITOR_FAILED(14034, "create guest editor fail"),
    /**
     * No Guest Editor Has This Email
     */
    NO_GUEST_EDITOR_FOUND_BY_EMAIL(14035, "No Guest Editor Has This Email"),
    /**
     * URL format error
     */
    URL_INVALID(14036, "URL format error"),
    /**
     * SPECIAL_ISSUE_CODE_NOT_FOUND
     */
    SPECIAL_ISSUE_CODE_NOT_FOUND(14037, "the special issue code is not found"),
    /**
     * Please check special issue's stage,it must be published
     */
    SPECIAL_ISSUE_NOT_PUBLISHED(14038, "Please check special issue's stage,it must be published"),
    /**
     * number of Oa can not less than 0
     */
    OA_NUMBER_INVALID(14039, "number of Oa can not less than 0"),
    /**
     * number of Oo can not less than 0
     */
    OO_NUMBER_INVALID(14040, "number of Oo can not less than 0"),
    /**
     * number of accepted articles can not bigger than number of oa articles plus number of oo articles
     */
    ACCEPTED_ARTICLE_NUMBER_INVALID(14041, "number of accepted articles can not bigger than number of oa articles plus number of oo articles"),
    /**
     * update failed
     */
    SPECIAL_ISSUE_PUBLICATION_DETAILS_UPDATE_FAILED(14042, "update failed"),
    /**
     * Insert failed
     */
    SPECIAL_ISSUE_PUBLICATION_DETAILS_INSERT_FAILED(14043, "Insert failed"),
    /**
     * update Si failed!
     */
    SPECIAL_ISSUE_UPDATE_FAILED(14044, "update Si failed!"),
    /**
     * ProjectCode not find!
     */
    PROJECT_CODE_NOT_FOUND(14045, "ProjectCode not find!"),
    /**
     * illegal guest editor list
     */
    GUEST_EDITOR_LIST_INVALID(14046, "illegal guest editor list"),
    /**
     * Acquired Date is not editable
     */
    ACQUIRED_DATE_NOT_EDITABLE(14047, "Acquired Date is not editable"),
    /**
     * Shelved stage is not editable!
     */
    SPECIAL_ISSUE_IN_SHELVED_STAGE(14048, "Shelved stage is not editable!"),
    /**
     * this user has none filter
     */
    USER_FILTER_NOT_FOUND(14049, "this user has none filter"),
    /**
     * this user has none column
     */
    USER_COLUMN_NOT_FOUND(14050, "this user has none column"),
    /**
     * loss of data
     */
    DATA_NOT_FOUND(14051, "loss of data"),
    /**
     * Special issue not found
     */
    SPECIAL_ISSUE_NOT_FOUND(14052, "Special issue not found"),
    /**
     * invalid stage
     */
    SPECIAL_ISSUE_STAGE_INVALID(14053, "invalid stage"),
    /**
     * number doesn't match the rule
     */
    NUMBER_INVALID(14054, "number doesn't match the rule "),
    /**
     * Please check your type
     */
    TYPE_INVALID(14055, "Please check your type"),
    /**
     * Contact first name is mandatory
     */
    CONTACT_FIRST_NAME_REQUIRED(14056, "Contact first name is mandatory"),
    /**
     * Contact last name is mandatory
     */
    CONTACT_LAST_NAME_REQUIRED(14057, "Contact last name is mandatory"),
    /**
     * Please create a contact use this email
     */
    CREATE_CONTACT_FAILED(14058, "Please create a contact use this email"),
    /**
     * update failed
     */
    UPDATE_JOURNAL_EO_FAILED(14059, "update failed"),
    /**
     * This email is not exist,Please Create one
     */
    CONTACT_NOT_FOUND_BY_EMAIL(14060, "This email is not exist,Please Create one"),
    /**
     * Can not read the si
     */
    SPECIAL_ISSUE_ACCESS_DENY(14061, "Can not read the si"),
    /**
     * data transport failed
     */
    DATA_TRANSPORT_FAILED(14062, "data transport failed"),
    /**
     * invalid SPECIAL_ISSUE_TYPE
     */
    SPECIAL_ISSUE_TYPE_INVALID(14063, "invalid SPECIAL_ISSUE_TYPE"),
    /**
     * data insert failed
     */
    DATA_INSERT_FAILED(14064, "data insert failed"),
    /**
     * si title duplicated
     */
    SPECIAL_ISSUE_TITLE_DUPLICATED(14065, "si title duplicated"),
    /**
     * invalid date
     */
    DATE_INVALID(14066, "invalid date"),
    /**
     * invalid articles
     */
    ARTICLE_INVALID(14067, "invalid articles"),
    /**
     * Transfer List can not be null
     */
    TRANSFER_LIST_NOT_FOUND(14068, "Transfer List can not be null"),
    /**
     * Can not update equal handlingCe
     */
    HANDLINGCE_REPEATED(14069, "Can not update equal handlingCe"),
    /**
     * Update Failed
     */
    UPDATE_FAILED(14070, "Update Failed"),
    /**
     * idea date can not be null in idea/proposal stage
     */
    NULL_IDEA_DATE_IN_IDEA_OR_PROPOSAL_STAGE(14071, "idea date can not be null in idea/proposal stage"),
    /**
     * Some data in the selected Special Issue is empty, please fill it in and try again
     */
    MISSING_SI_DATA(14072, "Some of the data in the selected Special Issue is empty, please fill it in and try again"),
    /**
     * Handing Ce do not exist
     */
    HANDLING_CE_NOT_EXIST(14073, "Handling Ce do not exist"),
    /**
     * lack mandatory field
     */
    LACK_MANDATORY_FIELDS(14074, "Mandatory fields need to be completely filled"),
    /**
     * journal name and code mismatched!
     */
    JOURNAL_NAME_AND_CODE_MISMATCH(14075, "journal name and code mismatched!"),
    /**
     * acquired date can not be changed!
     */
    ACQUIRED_DATE_CAN_NOT_CHANGE(14076, "acquired date can not be changed!"),
    /**
     * Invalid guest editors
     */
    GUEST_EDITORS_INVALID(14077, "invalid guest editors"),
    /**
     * Invalid remarks
     */
    REMARKS_INVALID(14078, "invalid remarks"),

    /**
     * Reactivate Reason should not exceed 10,000 characters in length!
     */
    REACTIVATE_REASON_LENGTH_INVALID(10479, "Reactivate Reason should not exceed 10,000 characters in length!"),
    /**
     * Reactivate Reason should be mandatory!
     */
    REACTIVATE_REASON_IS_MANDATORY(10480, "Reactivate Reason should be mandatory!"),
    /**
     * Shelved Reason should not exceed 10,000 characters in length!
     */
    SHELVED_REASON_LENGTH_INVALID(10481, "Shelved Reason should not exceed 10,000 characters in length!"),
    /**
     * Reactivate Reason should be mandatory!
     */
    SHELVED_REASON_IS_MANDATORY(10482, "Shelved Reason should be mandatory!"),
    /**
     * When it's ready for promotion,the paper commission can be only modified to "hybrid" or "open call"
     */
    PAPER_COMMISSION_METHOD_NOT_ALLOWED(10483, "This paper commission method is not allowed because it's ready for promotion"),
    /**
     * Si Marketing Topic should not exceed 1,000 characters in length!
     */
    MARKETING_TOPIC_LENGTH_INVALID(14084, "Si Marketing Topic should not exceed 1,000 characters in length!"),
    /**
     * Si Marketing Topics should not less than 3!
     */
    MARKETING_TOPIC_NUMBER_INVALID(14085, "Si Marketing Topics should not less than 3!"),
    /**
     * Si keyword should not exceed 500 characters in length!
     */
    MARKETING_KEYWORD_LENGTH_INVALID(14086, "Si keyword should not exceed 500 characters in length!"),
    /**
     * Si Marketing Keywords should not less than 3!
     */
    MARKETING_KEYWORD_NUMBER_INVALID(14087, "Si Marketing Keywords should not less than 3!"),
    /**
     * Si Marketing Competitive Title ISSN should be a string of 9 characters and the fifth is '-'!
     */
    MARKETING_ISSN_INVALID(14088, "Si Marketing Competitive Title ISSN should be a string of 9 characters and the fifth is '-'!"),
    /**
     * Si Marketing Competitive Title ISSNs should not less than 1!
     */
    MARKETING_ISSN_NUMBER_INVALID(14089, "Si Marketing Competitive Title ISSNs should not less than 1!"),
    /**
     * Si Marketing Competitive Title should not be duplicate in each si!
     */
    MARKETING_ISSN_DUPLICATE_INVALID(14090, "Si Marketing Competitive Title should not be duplicate in each si!"),
    /**
     * Si Marketing Reference should not exceed 1,000 characters in length!
     */
    MARKETING_REFERENCE_LENGTH_INVALID(14091, "Si Marketing Reference should not exceed 10,000 characters in length!"),
    /**
     * Si Marketing Others should not exceed 10,000 characters in length!
     */
    MARKETING_OTHER_LENGTH_INVALID(14092, "Si Marketing Others should not exceed 10,000 characters in length!"),
    /**
     * Si Marketing Aims and Scope should not exceed 10,000 characters in length!
     */
    MARKETING_AIMS_LENGTH_INVALID(14093, "Si Marketing Aims and Scope should not exceed 10,000 characters in length!"),
    /**
     * Si Marketing journal page link should be url format!
     */
    MARKETING_JOURNAL_SI_PAGE_LINK_URL_INVALID(14094, "Si Marketing journal page link should be url format!"),
    /**
     * Si Marketing specialIssue HTML link should be url format!
     */
    MARKETING_SPECIAL_ISSUE_HTML_LINK_URL_INVALID(14095, "Si Marketing specialIssue HTML link should be url format!"),
    /**
     * Si Marketing already existed!
     */
    MARKETING_EXISTED_CREATE_INVALID(14096, "Si Marketing already existed!"),
    /**
     * Create Si Marketing failed
     */
    MARKETING_CREATE_FAILED(14097, "Create Si Marketing failed"),

    /**
     * Update Si Marketing failed
     */
    MARKETING_UPDATE_FAILED(14098, "Update Si Marketing failed"),
    /**
     * Si paper commission method should be HYBRID or OPEN CALL
     */
    MARKETING_PAPER_COMMISSION_METHOD_INVALID(14099, "Si paper commission method should be HYBRID or OPEN CALL"),
    /**
     * si marketing data are empty, switching ready for promotion is not allowed
     */
    MARKETING_DATA_EMPTY_INVALID(14100, "si marketing data are empty. Please use switching function after marketing data are added."),
    /**
     * si marketing special issue html link is empty, switching ready for promotion is not allowed
     */
    MARKETING_SI_PAGE_LINK_EMPTY(14101, "si marketing special issue html link is empty. Please use switching function after data added."),
    /**
     * si marketing need to be created before editing
     */
    MARKETING_NOT_CREATED(14102, "Please create marketing before editing!"),
    /**
     * si marketing ready for promotion value invalid, please use "Yes" and "No".
     */
    MARKETING_READY_FOR_PROMOTION_INVALID(14103, "ready for promotion value invalid!Please use Yes and No"),
    /**
     * si marketing ISSN is repetitive
     */
    MARKETING_ISSN_REPETITIVE(14104, "ISSN should not be repetitive"),
    /**
     * CAT Journal is not valid
     */
    CAT_JOURNAL_INVALID(14105, "CAT Journal is not valid"),
    /**
     * email template not found
     */
    EMAIL_TEMPLATE_NOT_FOUND(14103, "Email template not found"),
    /**
     * illegal attachment file type error
     */
    ATTACHMENT_FILETYPE_INVALID(14104, "attachment file type should follow the outlook rules"),
    /**
     * attachment filename or content is missing
     */
    ATTACHMENT_NAME_OR_CONTENT_EMPTY(14105, "attachment filename or content is empty, please check the file completeness"),
    /**
     * delete attachment failed
     */
    DELETE_ATTACHMENT_ERROR(14106, "delete attachment failed"),
    /**
     * update si alert failed
     */
    UPDATE_SI_ALERT_FAILED(14107, "update si alert failed"),

    EVENT_PUBLISH_ERROR(14108, "event publish error"),
    /**
     * send email failed
     */
    SEND_MANUAL_EMAIL_FAILED(14109, "send email failed! Please try again."),
    /**
     * sender email is not in the system
     */
    INVALID_SENDER(14110, "sender email is not in the system."),
    /**
     * insert si abnormal edit history error
     */
    INSERT_SI_ABNORMAL_EDIT_HISTORY_ERROR(14111, "insert si abnormal edit history error"),
    /**
     * requestAttributes is null
     */
    REQUEST_ATTRIBUTES_IS_NULL(14112, "requestAttributes is null"),
    /**
     * OA ARTICLES number less than Waivers Used
     */
    OA_ARTICLES_LESS_THAN_numberOfWaiversUsed(14113, "OA ARTICLES number should be larger or equal with WAIVER(S) USED number"),
    /**
     * some change happened to SI Revenue Model, please try again
     */
    SI_REVENUE_MODEL_ERROR(14114, "some change happened to SI Revenue Model, please try again"),
    /**
     * the SI has been reactivated once.
     */
    REACTIVATE_NOT_ALLOW_ERROR(14115, "this si has been reactivated once."),
    /**
     * old SI is not in shelved stage, please check siCode
     */
    REACTIVATE_NOT_IN_SHELVED_STAGE(14116, "old SI is not in shelved stage, please check siCode"),
    /**
     * opt-in reason length is longer than limit
     */
    OPT_IN_REASON_LENGTH_ERROR(14117, "reason for opt-in length error"),
    /**
     * Current SI Pipeline and future SI Plan length error
     */
    FUTURE_SI_PLAN_LENGTH_ERROR(14118, "Current SI Pipeline and future SI Plan length error"),
    /**
     * the Journal Code is in the CAT Journal list with "Opt in" status already
     */
    JOURNAL_IN_CAT_JOURNAL_LIST_WITH_OPT_IN(14119, "the Journal Code is in the CAT Journal list with \"Opt in\" status already"),
    /**
     * the Journal Code is in the CAT Opt-in Request list already
     */
    JOURNAL_IN_OPT_IN_REQUEST(14120, "the Journal Code is in the CAT Opt-in Request list already"),
    /**
     * CAT Journal is not valid
     */
    CAT_JOURNAL_OPT_IN_INVALID(14121, "CAT Journal Opt In is not valid"),

    MARKETING_SUBMISSION_INSTRUCTIONS_INVALID(14122, "the character limitation is 10000"),
    /**
     * Request user not found
     */
    REQUEST_USER_NOT_FOUND(14123, "Request user not found!"),

    /**
     * Batch Type is invalid
     */
    INVALID_TYPE(14124, "Batch Type is invalid"),
    /**
     * Batch value is invalid
     */
    INVALID_BATCH_VALUE(14125, "Batch value is invalid"),
    /**
     * ongoing SI in the pipeline (all published or shelved)
     */
    ONGOING_SI_IN_PIPELINE(14126, "on going si in the pipeline"),
    /**
     * cat journal opt out invalid
     */
    CAT_JOURNAL_OPT_OUT_INVALID(14127, "cat journal opt out invalid"),
    /**
     * the Journal Code is in the CAT Journal list with "Opt in" status already
     */
    JOURNAL_IN_CAT_JOURNAL_LIST_WITH_OPT_OUT(14128, "the Journal Code is in the CAT Journal list with \"Opt out\" status already"),
    /**
     * the Journal Code is in the CAT Opt-in Request list already
     */
    JOURNAL_IN_OPT_OUT_REQUEST(14129, "the Journal Code is in the CAT Opt-out Request list already"),

    EXPORT_GE_TO_EXCEL(14130, "An error occurred while exporting Ge to Excel"),

    EXPORT_ALL_GE(14131, "An error occurred while exporting All Ge"),

    /**
     * io error while exporting special issues by excel
     */
    SPECIAL_ISSUE_EXPORT_ERROR_BY_EXCEL(14132, "io error while exporting special issues by excel"),
    /**
     * io error while exporting cfp data by xls
     */
    CFP_DATA_EXPORT_ERROR_BY_XLS(14133, "io error while exporting cfp data by xls"),
    /**
     * io error while exporting guest editors by excel
     */
    GUEST_EDITORS_EXPORT_ERROR_BY_EXCEL(14134, "io error while exporting guest editors by excel"),
    /**
     * the Si marketing data open for promotion during selected date is none
     */
    SI_MARKETING_OPEN_FOR_PROMOTION_NOT_FOUND(14135, "the SI marketing data open for promotion in selected date is none"),
    /**
     * the closing SI marketing data editors is none
     */
    CLOSING_SI_MARKETING_NOT_FOUND(14136, "the closing SI marketing data in selected date is none"),
    /**
     * io error while exporting SI marketing data file
     */
    SI_MARKETING_DATA_EXPORT_ERROR(14137, "io error while exporting SI marketing data file"),
    /**
     * io error while exporting the email editorial writing reminder data to GE
     */
    EMAIL_EDITORIAL_WRITING_REMINDER_TO_GUEST_EDITOR_ERROR(14138, "io error while exporting the email editorial writing reminder data to GE"),
    /**
     * io error while exporting cat journal by excel
     */
    CAT_JOURNAL_DATA_EXPORT_ERROR_BY_EXCEL(14139, "io error whiling exporting cat journal by excel"),
    /**
     * io error while exporting cat journal by csv
     */
    CAT_JOURNAL_DATA_EXPORT_ERROR_BY_CSV(14140, "io error while exprting cat journal by csv"),
    /**
     * class is utilized
     */
    UTILITY_CLASS(14141, "utility class"),
    /**
     * illegal future schedule
     */
    ILLEGAL_FUTURE_SCHEDULE(14142, "illegal future schedule"),
    /**
     * There are no SIP records in the current time interval
     */
    NO_SI_IN_TIME_INTERVAL(14143, "There are no SI records in the current time interval"),

    FILE_NAME_OR_CONTENT_EMPTY_ERROR(14144, "flag file name or content is empty"),

    DELETE_ERROR(14145, "flag file delete error"),

    DOWNLOAD_FILE_FAILED(14146, "download file failed"),
    GE_NOT_FOUND(14147, "GE ge not found"),

    CAT_JOURNAL_MODIFY_OPT_OUT_ATTEMPT(14148, "Illegal attempt to modify cat journal or code does not exist"),
    FILE_FORMAT_MISMATCH(14149, "file format mismatch"),

    WRONG_FILE_NUMBER(14150, "Wrong file number"),
    SEVER_ISSUE_AT_LAST_ONE(14151, "sever issue at last one"),
    FILE_NOT_EXIST(14152, "Delete failed, this file does not exist"),
    SEND_EMAIL_FAILURE(14153, "send email failure"),
    FILE_SIZE_TOO_LARGE(14154, "File size too large"),
    TOO_MANY_FILE(14155, "Evidence files can have up to 20"),
    MARKETING_READY_FOR_PROMOTION_CHECK_FAILED(14156, " marketing ready for promotion check failed"),
    CANNOT_HAVE_THE_SAME_FLAG(14157, "cannot have the same flag in one GE"),
    CAT_JOURNAL_UPDATE_TO_SAME_HANDLING_CE(14158, "cannot update entry to same handling CE"),
    THERE_IS_ON_NEED_TO_SEND_EMAIL(14159, "submission deadline has not been changed and there is no need to send an email"),

    DATE_FORMAT_ERROR(14161, "Date does not conform to the format"),
    RICHTEXT_PARSE_ERROR(14160,"Rich text parse to excel error."),
    ACTIVITY_NAME_ERROR(14162,"Invalid china marketing activity name"),
    MARKETING_OTHERS_INVALID(14163, "the character limitation is 10000"),
    DESCRIPTION_LENGTH_OVERFLOW(14164, "The description can not over 10000 characters"),
    FILE_LARGE_THAN_10MB(14165,"file is larger than 10MB");


    private Integer code;

    private String msg;

    BaseExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
