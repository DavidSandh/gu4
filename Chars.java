package gu4;

public class Chars {
	
	private static final int [][] A = {
			{0,0,0,0,0,0,0},
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0}};
			
	private static final int [][] B = {
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,1,1,0},
			{0,1,1,1,0,0,0},
			{0,1,0,0,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0}};

	private static final int [][] C = {
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0}};

private static final int [][] D = {
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0}};

	private static final int [][] E = {
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0}};

	
	private static final int [][] F = {
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0}};
			
	
	private static final int[][] G ={
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{1,0,0,0,0,0,0},
			{1,0,0,1,1,1,0},
			{1,0,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,1,0}};
	
	
	private static final int[][] H ={
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1}};
	
	private static final int[][] I ={
			{0,0,1,1,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,1,1,0,0}};
	
	private static final int[][] J ={
			{0,0,0,1,1,1,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,1,0,0},
			{0,0,1,1,0,0,0}};
	
	private static final int[][] K ={
			{0,1,0,0,0,1,0},
			{0,1,0,0,1,0,0},
			{0,1,0,1,0,0,0},
			{0,1,1,1,0,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,0,1}};
	
	private static final int[][] L ={
			{0,0,1,0,0,0,0},
			{0,0,1,0,0,0,0},
			{0,0,1,0,0,0,0},
			{0,0,1,0,0,0,0},
			{0,0,1,0,0,0,0},
			{0,0,1,0,0,0,0},
			{0,0,1,1,1,1,1}};
	
	private static final int[][] M ={
			{1,1,0,0,0,1,1},
			{1,0,1,0,1,0,1},
			{1,0,0,1,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1}};
	
	private static final int[][] N ={
			{1,0,0,0,0,0,1},
			{1,1,0,0,0,0,1},
			{1,0,1,0,0,0,1},
			{1,0,0,1,0,0,1},
			{1,0,0,0,1,0,1},
			{1,0,0,0,0,1,1},
			{1,0,0,0,0,0,1}};
	
	private static final int[][] O ={
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};
	
	private static final int[][] P ={
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0}};
	
	private static final int[][] Q ={
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,1,0,1},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,1}};
	
	private static final int[][] R ={
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,0,1}};
	
	private static final int[][] S ={
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,0,1,0,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,0,1,0,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};
	
	private static final int[][] T ={
			{1,1,1,1,1,1,1},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0}};
	
	private static final int[][] U ={
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};
	
	private static final int[][] V ={
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{0,1,0,0,0,1,0},
			{0,0,1,0,1,0,0},
			{0,0,0,1,0,0,0}};
	
	private static final int[][] W ={
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,1,0,0,1},
			{1,0,0,1,0,0,1},
			{1,0,1,0,1,0,1},
			{0,1,0,0,0,1,0}};
	
	private static final int[][] X ={
			{1,0,0,0,0,0,1},
			{0,1,0,0,0,1,0},
			{0,0,1,0,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,0,1,0,0},
			{0,1,0,0,0,1,0},
			{1,0,0,0,0,0,1}};
	
	private static final int[][] Y ={
			{1,0,0,0,0,0,1},
			{0,1,0,0,0,1,0},
			{0,0,1,0,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0}};
	
	private static final int[][] Z ={
			{1,1,1,1,1,1,1},
			{0,0,0,0,0,1,0},
			{0,0,0,0,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,0,0,0,0},
			{0,1,0,0,0,0,0},
			{1,1,1,1,1,1,1}};
	
	private static final int[][] � ={
			{0,0,1,1,1,0,0},
			{0,0,1,0,1,0,0},
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{1,1,1,1,1,1,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1}};
	
	private static final int[][] � ={
			{0,0,1,0,1,0,0},
			{0,0,1,0,1,0,0},
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{1,1,1,1,1,1,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1}};
	
	private static final int[][] � ={
			{0,0,1,0,1,0,0},
			{0,0,1,0,1,0,0},
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};
	
	private static final int[][] ASTERISK = {
			{1,0,0,1,0,0,1},
			{0,1,0,1,0,1,0},
			{0,0,1,1,1,0,0},
			{1,1,1,1,1,1,1},
			{0,0,1,1,1,0,0},
			{0,1,0,1,0,1,0},
			{1,0,0,1,0,0,1}};
	
	private static final int[][] PLUS = {
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{1,1,1,1,1,1,1},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0}};
	
	private static final int[][] MINUS = {
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0}};
	
	private static final int[][] FSLASH = {
			{0,0,0,0,0,0,1},
			{0,0,0,0,0,1,0},
			{0,0,0,0,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,0,0,0,0},
			{0,1,0,0,0,0,0},
			{1,0,0,0,0,0,0}};
	
	private static final int[][] BACKSLASH = {
			{1,0,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,0,1,0,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,0,1,0},
			{0,0,0,0,0,0,1}};
	
	private static final int[][] SPACE = {
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0}};
	
	private static final int[][] DOT = {
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,1,0,0,0}};
	
	private static final int[][] UNKNOWN = {
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,1,0}};
	
	private static final int[][] ZERO = {
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};

	private static final int[][] ONE = {
			{0,0,1,1,0,0,0},
			{0,1,1,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,1,1,0,0}};

	private static final int[][] TWO = {
			{0,1,1,1,1,1,0},
			{1,1,0,0,0,1,0},
			{0,0,0,0,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0}};

	private static final int[][] THREE = {
			{0,1,1,1,1,0,0},
			{1,1,0,0,1,1,0},
			{0,0,0,1,0,0,0},
			{0,0,1,1,0,0,0},
			{0,0,0,1,0,0,0},
			{1,1,0,0,1,1,0},
			{0,1,1,1,1,0,0}};

	private static final int[][] FOUR = {
			{0,0,0,0,1,0,0},
			{0,0,0,1,1,0,0},
			{0,0,1,0,1,0,0},
			{0,1,0,0,1,0,0},
			{1,1,1,1,1,1,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0}};

	private static final int[][] FIVE = {
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,0,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0},
			{0,1,1,1,1,0,0}};

	private static final int[][] SIX = {
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,1,1,1,0,0}};

	private static final int[][] SEVEN = {
			{0,1,1,1,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,1,0,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0}};
	
	private static final int[][] EIGHT = {
			{0,1,1,1,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,1,1,1,0,0}};

	private static final int[][] NINE = {
			{0,1,1,1,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,1,0,0},
			{0,1,1,1,1,0,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,1,0,0},
			{0,1,1,1,1,0,0}};
}





