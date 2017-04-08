package com.linky.hnews.bean;

/**
 * Created by linky on 17-4-8.
 * https://github.com/HackerNews/API
 */
public class Item {

    public int id;          //          The item's unique id.
    public boolean deleted; //          true if the item is deleted.
    public String type;     //          The type of item. One of "job", "story", "comment", "poll", or "pollopt".
    public String by;       //          The username of the item's author.
    public long time;       //          Creation date of the item, in Unix Time.
    public String text;     //          The comment, story or poll text. HTML.
    public boolean dead;    //      true if the item is dead.
    public int parent;      //      The item's parent. For comments, either another comment or the relevant story. For pollopts, the relevant poll.
    public int[] kids;      //      The ids of the item's comments, in ranked display order.
    public String url;      //      The URL of the story.
    public int score;       //      The story's score, or the votes for a pollopt.
    public String title;    //      The title of the story, poll or job.
    public int[] parts;     //      A list of related pollopts, in display order.
    public int descendants; //      In the case of stories or polls, the total comment count.

}
